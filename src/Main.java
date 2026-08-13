import attendance.Student;
import test.Bike;
import test.Car;

public class Main {
    public static void main(String[] args) {
        Student aashir = new Student();
        Student shayan = new Student();
        shayan.setName("Shayan");
        shayan.setClassName("1st year");
        aashir.setName("Aashir");
        aashir.setClassName("6th semester");

        // inner class object
        Student.Uniform aashirKaUniform = aashir.new Uniform();
        Student.Uniform shayanKaUniform = shayan.new Uniform();

        // calling objects
        aashir.setUniform(aashirKaUniform);
        aashir.getUniform(aashirKaUniform);
        shayan.getUniform(shayanKaUniform);

    }
}