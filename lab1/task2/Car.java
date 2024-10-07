package lab1.task2;

public class Car {
    private static int totalCarsProduced = 0;
    private static final int WHEELS = 4;

    private final String vin;
    private CarType type;
    private String color;

    {
        this.vin = generateVIN();
    }

    Car() {}

    Car(CarType type, String color) {
        this.type = type;
        this.color = color;
        totalCarsProduced++;
    }

    Car(String color) {
        this(CarType.SEDAN, color);
    }

    public static int getTotalCarsProduced() {
        return totalCarsProduced;
    }

    public static int getWheels() {
        return WHEELS;
    }

    public String getDescription() {
        return "Car Type: " + type + " Color: " + color + " VIN: " + vin;
    }

    public void paint(String newColor) {
        this.color = newColor;
    }

    public void paint() {
        this.color = "Silver";
    }

    private String generateVIN() {
        return "VIN" + (int)(Math.random() * 10000);
    }

    public String toString() {
        return getDescription();
    }
}
