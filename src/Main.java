import test.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "red";
        car.brand = "honda";
        car.speed = 210;
        car.model = "city";


        System.out.println(car.model);

    }
}