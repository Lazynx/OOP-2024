package lab2.task2;

public abstract class Piece {
    Position a;

    Piece(Position a) {
        this.a = a;
    }

    public abstract boolean isLegalMove(Position b);
}