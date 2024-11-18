package practice4;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
    }

    public Circle(Color color, int pos, double radius) {
        super(color, pos);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        if (color == Color.Black) {
            System.out.println("●");
        } else System.err.println("●");
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "], " + super.toString();
    }
}
