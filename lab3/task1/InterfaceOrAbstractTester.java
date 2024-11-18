package lab3.task1;

public class InterfaceOrAbstractTester {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Teacher", "teacher@kbtu.kz", "teacherpass123", "CS");

        System.out.println("Teacher Details:");
        System.out.println(teacher);

        teacher.displayRole();

        teacher.grantPermission("grade_assignment");
        teacher.grantPermission("view_student_profile");

        System.out.println("Has permission to grade_assignment: " + teacher.hasPermission("grade_assignment"));
        System.out.println("Has permission to edit_school_schedule: " + teacher.hasPermission("edit_school_schedule"));

        teacher.sendNotification("Please prepare grading for midterms.");
        teacher.sendNotification("Staff meeting scheduled for Friday.");

        System.out.println("Teacher's Last Notification: " + teacher.getLastNotification());
        teacher.getAllNotifications();

        System.out.println("\n");

        Student student = new Student("Vasya228", "vasya228@kbtu.kz", "studentpass123", 2);

        System.out.println("Student Details:");
        System.out.println(student);

        student.displayRole();

        student.grantPermission("access_library");
        student.grantPermission("view_grades");

        System.out.println("Has permission to access_library: " + student.hasPermission("access_library"));
        System.out.println("Has permission to register_courses: " + student.hasPermission("register_courses"));

        student.sendNotification("Your library membership has been activated.");
        student.sendNotification("New grades are available for your Math course.");

        System.out.println("Student's Last Notification: " + student.getLastNotification());
        student.getAllNotifications();
    }
}
