package test;

class vehichle{
    boolean tyres;
    String car_type;
    int vehicle_id;
}
public class Car extends vehichle{
    public String color;
    public String brand;
    public String model;
    public int year;
    public int speed;

    public void set_vehicle_id(int vehicleId){
        vehicle_id = vehicleId;
    }
    public void get_vehicle_id(){
        System.out.println(vehicle_id);
    }

    public void accelerate(int increment) {
    speed+=increment;
    }
    public void brake(int decrement) {
        speed-=decrement;
    }
}
