package lab2.task2;

public class Knight extends Piece {
    Knight(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.canMove()) return false;
        int dx = Math.abs(a.getX() - b.getX());
        int dy = Math.abs(a.getY() - b.getY());
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }

    @Override
    public String toString() {
        return "Knight - " + a.toString();
    }
}
