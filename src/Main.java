import test.Bike;
import test.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Bike bike1 = new Bike();


        car.color = "red";
        car.brand = "honda";
        car.speed = 210;
        car.model = "city";

        car.setOwner_name("Aashir");
        car.getOwner_name();
        System.out.println(car.model);
        car.get_vehicle_id();
        car2.get_vehicle_id();
        car3.get_vehicle_id();
        System.out.println("Bike id = ");
        bike1.color = "blue";
        bike1.brand = "honda";
        bike1.speed = 110;
        bike1.model = "125";
        bike1.get_vehicle_id();



    }
}