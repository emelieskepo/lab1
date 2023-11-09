import org.junit.Test;
import java.awt.*;
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
        saab.turnLeft();//"WEST"
        saab.turnLeft();//"SOUTH"
        saab.move(); //xPos += getCurrentSpeed=getCurrentSpeed
        assertEquals(-(saab.getCurrentSpeed()), saab.getYPos(), 0.0001);
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

    public void checkDirection(String expectedDirection, Car car) {
        assertEquals(expectedDirection, car.getDirection());
    }

    @Test
    public void saabEnginePower(){
        assertEquals(125, saab.getEnginePower(), 0.0001);
    }

    @Test
    public void saabSetCurrentSpeed(){
        saab.setCurrentSpeed(10);
        assertEquals(10, saab.getCurrentSpeed(), 0.0001);
    }

    @Test
    public void saabGetColor(){
        assertEquals(Color.red, saab.getColor());
    }

    @Test
    public void saabSetColor(){
        saab.setColor(Color.black);
        assertEquals(Color.black, saab.getColor());
    }
    //setColor - getColor (class Car)E

    @Test

    public void saabStartEngine(){
        saab.startEngine();
       assertEquals(0.1, saab.getCurrentSpeed(), 0.0001);
    }


    //gas (class Car)

    //brake (class Car)
    @Test
    public void saabSetTurboOff(){
        saab.setTurboOff();
        assertFalse(saab.isTurboOn());
    }
    //setTurboOff (class Saab95)M

    @Test
    //speedFactor (class Saab95)M
    public void saabCheckSpeedFactorWithTurboOff(){
        assertEquals(saab.getEnginePower() * 0.01 * 1, saab.speedFactor(), 0.0001);

    }

    @Test
    public void incrementSpeedForSaabIfTurboOn(){
        saab.setTurboOn();
        saab.incrementSpeed(10);
        assertEquals(saab.getEnginePower() * 0.01 * 1.3 * 10, saab.getCurrentSpeed(), 0.0001);
    }

    @Test
    public void decrementSpeedForSaab(){
        saab.setCurrentSpeed(50);
        double originalSpeed = saab.getCurrentSpeed();
        saab.decrementSpeed(10);
        assertEquals(originalSpeed - saab.speedFactor() * 10, saab.getCurrentSpeed(), 0.0001);
        //setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
    }

    @Test
    public void volvoCheckSpeedFactor(){
    assertEquals(volvo.getEnginePower() * 0.01 * 1.2, volvo.speedFactor(), 0.001);
    }

    @Test
    public void incrementSpeedForVolvo(){
        volvo.incrementSpeed(10);
        assertEquals(Math.min(volvo.speedFactor() * 10, volvo.getEnginePower()), volvo.getCurrentSpeed(), 0.0001);
    }

    @Test
    public void decrementSpeedForVolvo(){
        volvo.setCurrentSpeed(30);
        double originalSpeed = volvo.getCurrentSpeed();
        volvo.decrementSpeed(10);
        assertEquals(Math.max(originalSpeed - volvo.speedFactor() * 10,0), volvo.getCurrentSpeed(), 0.001);
    }
}

