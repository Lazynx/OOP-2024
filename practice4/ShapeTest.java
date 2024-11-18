package practice4;

import java.util.Vector;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(Color.Black, 3, 5);
        Circle circle2 = new Circle(Color.Red, 5, 1);
        Rectangle rectangle1 = new Rectangle(Color.Black, 5, 1, 2);
        Rectangle rectangle2 = new Rectangle(Color.Red, 0, 6, 2);
        Triangle triangle1 = new Triangle(Color.Red, 5, 1, 2);
        Triangle triangle2 = new Triangle(Color.Black, 0, 6, 2);

        Vector<Shape> shapes = new Vector<Shape>();
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(rectangle1);
        shapes.add(rectangle2);
        shapes.add(triangle1);
        shapes.add(triangle2);

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
