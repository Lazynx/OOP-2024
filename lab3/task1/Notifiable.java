package lab3.task1;

public interface Notifiable {
    void sendNotification(String message);
    String getLastNotification();
    void getAllNotifications();
}
