package lab3.task1;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Teacher extends User implements Authorizable, Notifiable {
    final private UUID employeeId;
    private String department;
    private Set<String> permissions = new HashSet<>();
    private List<String> notifications = new ArrayList<>();

    public Teacher() {
        this.employeeId = UUID.randomUUID();
    }

    public Teacher(String username, String email, String password, String department) {
        super(username, email, password);
        this.employeeId = UUID.randomUUID();
        this.department = department;
    }

    public UUID getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
        System.out.println("Message was sent to Teacher: " + message);
    }

    @Override
    public String getLastNotification() {
        return notifications.isEmpty() ? "No notifications" : notifications.get(notifications.size() - 1);
    }

    @Override
    public void getAllNotifications() {
        System.out.println("All notifications of Teacher: ");
        for (String notification : notifications) {
            System.out.println(notification);
        }
    }

    @Override
    public void displayRole() {
        System.out.println("Role - Teacher");
    }

    @Override
    public String toString() {
        return "Teacher [employeeId=" + employeeId + ", department=" + department + "], " + super.toString();
    }
}
