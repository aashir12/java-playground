package test;

public class Car {
    public String color;
    public String brand;
    public String model;
    public int year;
    public int speed;

    public void accelerate(int increment) {
    speed+=increment;
    }
    public void brake(int decrement) {
        speed-=decrement;
    }
}
