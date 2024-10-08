package lab2.task2;

public class King extends Piece {
    King(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.canMove()) return false;
        return Math.abs(a.getX() - b.getX()) <= 1 && Math.abs(a.getY() - b.getY()) <= 1;
    }

    @Override
    public String toString() {
        return "King - " + a.toString();
    }
}
