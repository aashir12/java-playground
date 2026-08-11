package attendance;

public class Student {
    public static int rollNumber = 0;
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

    static{
        rollNumber++;
    }

    Student(){
        System.out.println("Student No = "+rollNumber);
    }
}
