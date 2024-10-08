package lab2.task1.partA;

public abstract class Shape3D {
    public abstract double volume();

    public abstract double surfaceArea();

    @Override
    public String toString() {
        return "Shape3d [volume: " + volume() + ", surfaceArea: " + surfaceArea() + "]";
    }
}
