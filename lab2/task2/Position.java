package lab2.task2;

public class Position {
    private char x;
    private int y;

    public Position() {}

    public Position(char x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(char x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean canMove() {
        return x >= 'a' && x <= 'h' && y >= 1 && y <= 8;
    }

    @Override
    public String toString() {
        return "Position [x: " + x + ", y: " + y + "]";
    }
}
