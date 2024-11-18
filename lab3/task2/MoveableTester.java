package lab3.task2;

public class MoveableTester {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println("Initial state: " + person);
        person.setSpeed(5.0);
        System.out.println("Speed set to: " + person.getSpeed());
        person.move(10);
        System.out.println("Current position: " + person.getDistance());
        person.stop();
        System.out.println("Speed after stopping: " + person.getSpeed());
        System.out.println("Final state: " + person);
        System.out.println("\n");


        Helicopter helicopter = new Helicopter();

        System.out.println("Initial state: " + helicopter);
        helicopter.setSpeed(200.0);
        System.out.println("Speed set to: " + helicopter.getSpeed());
        helicopter.setAltitude(500);
        System.out.println("Altitude set to: " + helicopter.getAltitude());
        helicopter.move(50);
        System.out.println("Current position: " + helicopter.getDistance());
        helicopter.flyUp();
        System.out.println("Current altitude after flew up: " + helicopter.getAltitude());
        helicopter.stop();
        System.out.println("Speed and altitude after stopping: " + helicopter.getSpeed() + ", " + helicopter.getAltitude());
        System.out.println("Final state: " + helicopter);
    }
}
