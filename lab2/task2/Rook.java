package lab2.task2;

public class Rook extends Piece {
    Rook(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.canMove()) return false;
        return a.getX() == b.getX() || a.getY() == b.getY();
    }

    @Override
    public String toString() {
        return "Rook - " + a.toString();
    }
}
