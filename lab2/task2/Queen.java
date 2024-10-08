package lab2.task2;

public class Queen extends Piece {
    Queen(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!b.canMove()) return false;
        return new Bishop(a).isLegalMove(b) || new Rook(a).isLegalMove(b);
//        return (a.getX() == b.getX() || a.getY() == b.getY()) || (Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY()));
    }

    @Override
    public String toString() {
        return "Queen - " + a.toString();
    }
}
