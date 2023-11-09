import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    public Saab95 saab = new Saab95();
    public Volvo240 volvo = new Volvo240();

    @Test
    public void saabTurnLeft(){
        // Testar om Saab95 svänger vänster och ändrar riktning till "WEST"
        saab.turnLeft();
        assertEquals("WEST", saab.getDirection());
        //checkDirection("WEST", saab);
    }

    @Test
    public void saabTurnRight(){
        // Testar om Saab95 svänger höger och ändrar riktning till "EAST"
        saab.turnRight();
        assertEquals("EAST", saab.getDirection());
        //checkDirection("EAST", saab);
    }

    @Test
    public void saabTurnRightAndMoveForward(){
        // Testar om Saab95 svänger höger och sedan rör sig framåt
        saab.turnRight(); //"EAST"
        saab.move(); //xPos += getCurrentSpeed=getCurrentSpeed
        assertEquals(saab.getCurrentSpeed(), saab.getXPos(), 0.0001);
    }

    @Test
    public void saabTurnLeftAndMoveForward(){
        // Testar om Saab95 svänger vänster och sedan rör sig framåt
        saab.turnLeft(); //"WEST"
        saab.move(); //xPos += getCurrentSpeed=getCurrentSpeed
        assertEquals(-(saab.getCurrentSpeed()), saab.getXPos(), 0.0001);
    }

    @Test
    public void volvoNumberOfDoors(){
        // Testar om antalet dörrar för Volvo240 är 4
        assertEquals(4, volvo.getNrDoors());
    }

    @Test
    public void setTurboOnSaab(){
        // Testar att sätta turbo-läget på Saab95 och kontrollera att det är på
        saab.setTurboOn();
        assertTrue(saab.isTurboOn());
    }
    @Test
    private void checkDirection(String expectedDirection, Car car) {
        assertEquals(expectedDirection, car.getDirection());
    }

}