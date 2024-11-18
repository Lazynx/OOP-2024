package practice4;

public class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(Color color, int pos, int width, int height) {
        super(color, pos);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();
        if (color == Color.Black) {
            System.out.println("▬");
        } else System.err.println("▬");
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "], " + super.toString();
    }
}
