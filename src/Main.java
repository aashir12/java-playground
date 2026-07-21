import test.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

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


    }
}