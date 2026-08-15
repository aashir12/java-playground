package attendance;

import java.util.*;

public class Student implements  Bacha{

    public static int rollNumber = 0;
    public Set<Boolean> weeklyAttendance = new TreeSet<>();
    public Set<String> subjects = new TreeSet<>();

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

    public static void printWeeklyAttendance(Student student){
        if(student.weeklyAttendance != null){
            System.out.println(student.weeklyAttendance);
        }
        else{
            System.out.println("Student is empty");
        }
    }

    public static void printSubjects(Student student) {
        if (student.subjects == null || student.subjects.isEmpty()) {
            System.out.println("Subjects are not added yet");
        } else {
            System.out.println(student.subjects);
        }
    }

    // inner nested class

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