package lab2.task1.partA;

import static java.lang.Math.pow;

public class Cube extends Shape3D {
    private double length;

    public Cube() {}

    public Cube(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double volume() {
        return pow(length, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * pow(length, 2);
    }

    @Override
    public String toString() {
        return "Cube [length=" + length + "], " + super.toString();
    }
}