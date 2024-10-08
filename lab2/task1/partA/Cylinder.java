package lab2.task1.partA;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Cylinder extends Shape3D {
    private double radius, height;

    public Cylinder() {}

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return PI * pow(radius, 2) * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * PI * pow(radius, 2) + 2 * PI * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder [radius=" + radius + ", height=" + height + "]";
    }
}
