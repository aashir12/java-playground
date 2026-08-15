package attendance;

import java.util.*;

public class Student implements Bacha {

    public static int rollNumber = 0;
    public Set<Boolean> weeklyAttendance = new TreeSet<>();
    public Set<String> subjects = new TreeSet<>();
    public static Queue<Student> students = new LinkedList<>();

    private String name;
    private String className;
    private Uniform uniform;

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

    public Student() {
        rollNumber++;
        System.out.println("Student No = " + rollNumber);
    }

    public static void printWeeklyAttendance(Student student) {
        if (student != null && student.weeklyAttendance != null) {
            System.out.println(student.weeklyAttendance);
        } else {
            System.out.println("Student is empty");
        }
    }

    public static void printSubjects(Student student) {
        if (student == null || student.subjects == null || student.subjects.isEmpty()) {
            System.out.println("Subjects are not added yet");
        } else {
            System.out.println(student.subjects);
        }
    }

    // Inner nested class
    public class Uniform {
        boolean tie;
        boolean shoePolished;
        boolean officialShoe;
        boolean hairCut;

        public String returnUniform() {
            return "[tie = " + this.tie + " , shoePolished = " + shoePolished + ", officialShoe = " + officialShoe + ", hairCut = " + this.hairCut + "]";
        }
    }

    public void setUniform(boolean tie, boolean shoePolished, boolean officialShoe, boolean hairCut) {
        this.uniform = new Uniform();
        this.uniform.tie = tie;
        this.uniform.shoePolished = shoePolished;
        this.uniform.officialShoe = officialShoe;
        this.uniform.hairCut = hairCut;
    }

    // Updated to print internal 'uniform' field directly
    public void getUniform() {
        if (this.uniform == null) {
            System.out.println("No uniform set");
            return;
        }
        System.out.println("Tie: " + this.uniform.tie);
        System.out.println("Shoe Polished: " + this.uniform.shoePolished);
        System.out.println("Official Shoe: " + this.uniform.officialShoe);
        System.out.println("Hair Cut: " + this.uniform.hairCut);
    }

    @Override
    public String toString() {
        String uniformDetails = (uniform != null) ? uniform.returnUniform() : "No Uniform Set";
        return "Student{ name = " + name + ", class = " + className + ", uniform = " + uniformDetails + " }";
    }

    // console Queue
    public static void printStudents() {
        System.out.println(students.toString());
    }
}