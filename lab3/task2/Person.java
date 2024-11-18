package lab3.task2;

public class Person implements Moveable {
    private double speed = 0;
    private double position = 0;

    public Person() {}

    public Person(double speed, double position) {
        this.speed = speed;
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
        System.out.println("person moved at " + position);
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println("person stopped");
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Person [speed=" + speed + ", position=" + position + "]";
    }
}
