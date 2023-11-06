import java.awt.*;
//hejsvej

public class Cars {

    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name

    public Cars(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
    }

    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public double speedFactor(){
        return speedFactor();
    }

    //implementera en standardmetod som
    //båda subklasserna kan överskugga
    public void incrementSpeed(double amount){

    }

    public void decrementSpeed(double amount){

    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
    }

}