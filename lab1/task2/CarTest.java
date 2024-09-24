package lab1.task2;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car(CarType.SUV, "Red");
        Car car2 = new Car("Blue");

        System.out.println(car1.getDescription());
        System.out.println(car2.getDescription());

        car2.paint("Green");
        System.out.println(car2.getDescription());

        car1.paint();
        System.out.println(car1.getDescription());

        System.out.println("Total cars produced: " + Car.getTotalCarsProduced());

        System.out.println("Each car has " + Car.getWheels() + " wheels.");
    }
}
