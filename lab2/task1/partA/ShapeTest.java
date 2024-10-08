package lab2.task1.partA;

public class ShapeTest {
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube surfaceArea: " + cube.surfaceArea());

        Cylinder cylinder = new Cylinder(3, 4);
        System.out.println("Cylinder volume: " + cylinder.volume());
        System.out.println("Cylinder surfaceArea: " + cylinder.surfaceArea());

        Sphere sphere = new Sphere(5);
        System.out.println("Sphere volume: " + sphere.volume());
        System.out.println("Sphere surfaceArea: " + sphere.surfaceArea());
    }
}
