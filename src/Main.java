import test.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.brand = "honda";
        car.speed = 210;
        car.model = "city";

        car.setOwner_name("Aashir");
        car.getOwner_name();
        car.set_vehicle_id(1);
        car.get_vehicle_id();
        System.out.println(car.model);

    }
}