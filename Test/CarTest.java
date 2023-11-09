import org.junit.Test;
import java.awt.*;
import static org.junit.Assert.*;

public class CarTest {

    public Saab95 saab = new Saab95();
    @Test
    public void saabTurnLeft(){
        saab.turnLeft();
        assertTrue("WEST"==saab.getDirection());
        saab.turnLeft();
        assertTrue("SOUTH"==saab.getDirection());
        saab.turnLeft();
        assertTrue("EAST"==saab.getDirection());
        saab.turnLeft();
        assertTrue("NORTH"==saab.getDirection());
    }

    @Test
    public void saabTurnRight(){
        saab.turnRight();
        assertTrue("EAST"==saab.getDirection());
        saab.turnRight();
        assertTrue("SOUTH"==saab.getDirection());
        saab.turnRight();
        assertTrue("WEST"==saab.getDirection());
        saab.turnRight();
        assertTrue("NORTH"==saab.getDirection());
    }
    @Test
    public void saabTurnRightAndMoveForward(){
            saab.turnLeft();
            saab.move(); //xPos += getCurrentSpeed=getCurrentSpeed
            assertEquals(saab.getCurrentSpeed(), saab.getXPos(), 0.0001);

            saab.turnLeft();
            saab.move(); //xPos += getCurrentSpeed=getCurrentSpeed
            assertEquals(saab.getCurrentSpeed(), -(saab.getYPos()), 0.0001);

            saab.turnLeft();
            saab.move(); //xPos += getCurrentSpeed=getCurrentSpeed
            assertEquals(saab.getCurrentSpeed(), -(saab.getXPos()), 0.0001);

            saab.turnLeft();
            saab.move(); //xPos += getCurrentSpeed=getCurrentSpeed
            assertEquals(saab.getCurrentSpeed(), saab.getYPos(), 0.0001);




    }
   /* @Test
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
    }*/

    @Test
    public void saabNumberOfDoors(){
        // Testar om antalet dörrar för Volvo240 är 4
        assertEquals(2, saab.getNrDoors());
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
    @Test
    public void saabGetEnginePower(){

        assertEquals(125, saab.getEnginePower(), 0.0001);
    }

}

