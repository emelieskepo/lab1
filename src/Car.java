import java.awt.*;

public abstract class Car implements Movable {

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double xPos = 0;
    private double yPos = 0;
    private String direction = "NORTH";

    public Car(int nrDoors, double enginePower, Color color, String modelName) { //Konstruktor
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        stopEngine();
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public String getDirection() {
        return direction;
    }

    public double getYPos() {
        return yPos;
    }

    public double getXPos() {
        return xPos;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        if(currentSpeed >= 0 && currentSpeed <= this.enginePower){
            this.currentSpeed = currentSpeed;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public abstract double speedFactor(); //metoden finns men den är inte implementerad

    public abstract void incrementSpeed(double amount);

    public abstract void decrementSpeed(double amount);

    public void move() {
        switch (direction) {
            case "NORTH" -> this.yPos += getCurrentSpeed();
            case "EAST" -> this.xPos += getCurrentSpeed();
            case "SOUTH" -> this.yPos -= getCurrentSpeed();
            case "WEST" -> this.xPos -= getCurrentSpeed();
        }
    }

    public void turnLeft() {
        switch (direction) {
            case "NORTH" -> this.direction = "WEST";
            case "EAST" -> this.direction = "NORTH";
            case "SOUTH" -> this.direction = "EAST";
            case "WEST" -> this.direction = "SOUTH";
        }
    }

    public void turnRight() {
        switch (direction) {
            case "WEST" -> this.direction = "NORTH";
            case "NORTH" -> this.direction = "EAST";
            case "EAST" -> this.direction = "SOUTH";
            case "SOUTH" -> this.direction = "WEST";
        }
    }

    public void gas(double amount) {
        if (amount >= 0 && amount <= 1) {
           incrementSpeed(amount);
        }

        }

    public void brake(double amount) {
        if (amount >= 0 && amount <= 1) {
            decrementSpeed(amount);
        }
    }
}
