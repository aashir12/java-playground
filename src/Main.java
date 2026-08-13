import attendance.Student;
import test.Bike;
import test.Car;

public class Main {
    public static void main(String[] args) {
        Student aashir = new Student();
        aashir.setName("Aashir");
        aashir.setClassName("6th semester");
        Student.Uniform aashirKaUniform = aashir.new Uniform();
        aashir.setUniform(aashirKaUniform);
        aashir.getUniform(aashirKaUniform);

    }
}