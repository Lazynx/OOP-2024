package lab2.task2;

public class Bishop extends Piece {
    public Bishop() {

    }

    public Bishop(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.canMove()) return false;
        return Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY());
    }

    @Override
    public String toString() {
        return "Bishop - " + a.toString();
    }
}
