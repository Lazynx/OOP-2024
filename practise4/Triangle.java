package practise4;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
        super();
    }

    public Triangle(Color color, int pos, double base, double height) {
        super(color, pos);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
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
            System.out.println("▲");
        } else System.err.println("▲");
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "], " + super.toString();
    }
}
