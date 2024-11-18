package practice4;

public abstract class Shape {
    Color color;
    private int pos;

    public Shape() {

    }

    public Shape(Color color, int pos) {
        this.color = color;
        this.pos = pos;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void draw() {
        System.out.print(" ".repeat(pos));
    };

    public String toString() {
        return "Shape [color=" + color + ", pos=" + pos + "]";
    }
}
