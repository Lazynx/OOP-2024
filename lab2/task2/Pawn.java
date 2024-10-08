package lab2.task2;

public class Pawn extends Piece {
    Pawn(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.canMove()) return false;
        return (a.getX() == b.getX() && b.getY() == a.getY() + 1);
    }

    @Override
    public String toString() {
        return "Pawn - " + a.toString();
    }
}
