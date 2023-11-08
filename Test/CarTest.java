import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {

    public Saab95 saab = new Saab95();
    public Volvo240 volvo = new Volvo240();

    @Test
    public void saabTurnLeft(){
        saab.turnLeft();
        assertEquals("WEST", saab.getDirection());
    }

    @Test
    public void saabTurnRight(){
        saab.turnRight();
        assertEquals("EAST", saab.getDirection());
    }

    @Test
    public void saabTurnRightAndMoveForward(){
        saab.turnRight(); //"EAST"
        saab.move(); //xPos += getCurrentSpeed=getCurrentSpeed
        assertEquals(saab.getCurrentSpeed(), saab.getXPos(), 0.0001);
    }

    @Test
    public void saabTurnLeftAndMoveForward(){
        saab.turnLeft(); //"WEST"
        saab.move(); //xPos += getCurrentSpeed=getCurrentSpeed
        assertEquals(-(saab.getCurrentSpeed()), saab.getXPos(), 0.0001);
    }

    @Test
    public void volvoNumberOfDoors(){
        assertEquals(4, volvo.getNrDoors());
    }

    @Test
    public void setTurboOn(){
        //assertEquals(True,saab.setTurboOn());

    }

}