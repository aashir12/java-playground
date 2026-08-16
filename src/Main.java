import attendance.Student;

public class Main {
    public static void main(String[] args) {
        Student aashir = new Student();
        Student shayan = new Student();

        shayan.setName("Shayan");
        shayan.setClassName("1st year");

        aashir.setName("Aashir");
        aashir.setClassName("6th semester");

        // Queue
        Student.students.offer(aashir);
        Student.students.offer(shayan);

        //Priorty Queue
        aashir.friends.add("hamza");
        System.out.println(aashir.friends);
        aashir.friends.offer("jay");
        aashir.friends.offer("ali");
        aashir.friends.offer("nadeem");

        System.out.println(aashir.friends.poll());
        System.out.println(aashir.friends);

        System.out.println(aashir.friends);


        // Set Subjects
        aashir.subjects.add("english");
        aashir.subjects.add("urdu");
        aashir.subjects.add("hindi");
        aashir.subjects.add("islamiat");
        aashir.subjects.add("arabic");

        Student.printSubjects(aashir);
        Student.printSubjects(shayan);

        // Weekly attendance loop
        for (int day = 0; day < 7; day++) {
            aashir.weeklyAttendance.add(day % 2 == 0);
            shayan.weeklyAttendance.add(day % 2 != 0);
        }

        Student.printWeeklyAttendance(aashir);
        Student.printWeeklyAttendance(shayan);

        // Assign uniforms BEFORE printing the final queue output
        aashir.setUniform(true, true, false, false);
        shayan.setUniform(true, false, false, true);

        // Print final queue state (uniforms will now show correctly)
        System.out.println("\n--- Final Students Queue ---");
        Student.printStudents();
    }
}