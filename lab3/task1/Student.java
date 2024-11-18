package lab3.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.HashSet;

public class Student extends User implements Authorizable, Notifiable {
    private final UUID studentId;
    private int yearOfStudy;
    private Set<String> permissions = new HashSet<>();
    private List<String> notifications = new ArrayList<>();

    public Student() {
        this.studentId = UUID.randomUUID();
    }

    public Student(String username, String email, String password, int yearOfStudy) {
        super(username, email, password);
        this.studentId = UUID.randomUUID();
        this.yearOfStudy = yearOfStudy;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public boolean hasPermission(String permission) {
        return permissions.contains(permission);
    }

    @Override
    public void grantPermission(String permission) {
        permissions.add(permission);
    }

    @Override
    public void sendNotification(String message) {
        notifications.add(message);
        System.out.println("Message was sent to Student: " + message);
    }

    @Override
    public String getLastNotification() {
        return notifications.isEmpty() ? "No notifications" : notifications.get(notifications.size() - 1);
    }

    @Override
    public void getAllNotifications() {
        System.out.println("All notifications of Student: ");
        for (String notification : notifications) {
            System.out.println(notification);
        }
    }

    @Override
    public void displayRole() {
        System.out.println("Role - Student");
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", yearOfStudy=" + yearOfStudy + "], " + super.toString();
    }
}
