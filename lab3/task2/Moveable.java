package lab3.task2;

public interface Moveable {
    void move(double time);
    double getDistance();
    void stop();
    double getSpeed();
    void setSpeed(double speed);
}
