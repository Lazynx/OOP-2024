package lab3.task1;

public interface Authorizable {
    boolean hasPermission(String permission);
    void grantPermission(String permission);
}
