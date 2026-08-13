package attendance;

import java.util.ArrayList;
import java.util.List;

public class Student implements  Bacha{

    public static int rollNumber = 0;
    public List<Boolean> weeklyAttendance = new ArrayList<>();

    private String name;
    private String className;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // This runs only once when the Student class is loaded
    static {
        rollNumber++;
    }

    public Student() {
        System.out.println("Student No = " + rollNumber);
    }

    public class Uniform {
        boolean tie;
        boolean shoePolished;
        boolean officialShoe;
        boolean hairCut;
    }

    public void setUniform(Uniform student) {
        student.tie = true;
        student.shoePolished = true;
        student.officialShoe = true;
        student.hairCut = true;
    }
    public void getUniform(Uniform student) {
        System.out.println(student.tie);
        System.out.println(student.shoePolished);
        System.out.println(student.officialShoe);
        System.out.println(student.hairCut);
    }

}