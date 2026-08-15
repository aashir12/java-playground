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

        // linked list
        aashir.subjects.add("english");
        aashir.subjects.add("urdu");
        aashir.subjects.add("urdu");
        aashir.subjects.add("hindi");
        aashir.subjects.add("islamiat");
        aashir.subjects.add("arabic");

        Student.printSubjects(aashir);
        Student.printSubjects(shayan);

        // weekly attendence
        for (int day = 0; day < 7; day++) {
            if (day % 2 == 0) {
                aashir.weeklyAttendance.add(true);
            } else {
                aashir.weeklyAttendance.add(false);
            }
        }
        for(int day = 0 ; day<7 ; day++){
            if(day%2!=0){
                shayan.weeklyAttendance.add(true);
            }
            else{
                shayan.weeklyAttendance.add(false);
            }
        }
        Student.printWeeklyAttendance(aashir);
        Student.printWeeklyAttendance(shayan);

        // inner class object
        Student.Uniform aashirKaUniform = aashir.new Uniform();
        Student.Uniform shayanKaUniform = shayan.new Uniform();

        // calling objects
        aashir.setUniform(aashirKaUniform);
        aashir.getUniform(aashirKaUniform);
        shayan.getUniform(shayanKaUniform);

    }
}