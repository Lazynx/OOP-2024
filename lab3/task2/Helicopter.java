package lab3.task2;

public class Helicopter implements Flyable {
    private double speed = 0;
    private double altitude = 0;
    private double position = 0;

    public Helicopter() {}

    public Helicopter(double speed, double altitude, double position) {
        this.speed = speed;
        this.altitude = altitude;
        this.position = position;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double getDistance() {
        return position;
    }

    @Override
    public void move(double time) {
        position += time * speed;
        System.out.println("helicopter moved at " + position);
    }

    @Override
    public void stop() {
        speed = 0;
        altitude = 0;
        System.out.println("helicopter stopped");
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public double getAltitude() {
        return altitude;
    }

    @Override
    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    @Override
    public void flyUp() {
        altitude += 100;
        System.out.println("helicopter flew up, it's altitude: " + altitude);
    }

    @Override
    public String toString() {
        return "Helicopter [speed=" + speed + ", altitude=" + altitude + ", position=" + position + "]";
    }
}
