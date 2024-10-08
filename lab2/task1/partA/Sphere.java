package lab2.task1.partA;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere() {}

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return ((double) 4 / 3) * PI * Math.pow(radius, 3);
    }

    @Override
    public double surfaceArea() {
        return 4 * PI * pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Sphere [radius=" + radius + "], " + super.toString();
    }
}
