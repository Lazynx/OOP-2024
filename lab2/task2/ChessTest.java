package lab2.task2;

public class ChessTest {
    public static void main(String[] args) {
        Position rookStart = new Position('a', 1);
        Position rookMove1 = new Position('a', 8);
        Position rookMove2 = new Position('h', 1);
        Position rookIllegalMove = new Position('B', 2);

        Rook rook = new Rook(rookStart);
        System.out.println(rook);
        System.out.println("Rook legal move (a1 to a8)? " + rook.isLegalMove(rookMove1));
        System.out.println("Rook legal move (a1 to h1)? " + rook.isLegalMove(rookMove2));
        System.out.println("Rook legal move (a1 to b2)? " + rook.isLegalMove(rookIllegalMove));

        Position kingStart = new Position('e', 1);
        Position kingMove1 = new Position('d', 2);
        Position kingIllegalMove = new Position('e', 3);

        King king = new King(kingStart);
        System.out.println(king);
        System.out.println("King legal move (e1 to d2)? " + king.isLegalMove(kingMove1));
        System.out.println("King legal move (e1 to e3)? " + king.isLegalMove(kingIllegalMove));


        Position queenStart = new Position('d', 1);
        Position queenMove1 = new Position('d', 8);
        Position queenMove2 = new Position('h', 1);
        Position queenMove3 = new Position('A', 4);
        Position queenIllegalMove = new Position('b', 2);

        Queen queen = new Queen(queenStart);
        System.out.println(queen);
        System.out.println("Queen legal move (d1 to d8)? " + queen.isLegalMove(queenMove1));
        System.out.println("Queen legal move (d1 to h1)? " + queen.isLegalMove(queenMove2));
        System.out.println("Queen legal move (d1 to a4)? " + queen.isLegalMove(queenMove3));
        System.out.println("Queen legal move (d1 to b2)? " + queen.isLegalMove(queenIllegalMove));

        Position bishopStart = new Position('c', 1);
        Position bishopMove1 = new Position('f', 4);
        Position bishopIllegalMove = new Position('c', 4);

        Bishop bishop = new Bishop(bishopStart);
        System.out.println(bishop);
        System.out.println("Bishop legal move (c1 to f4)? " + bishop.isLegalMove(bishopMove1));
        System.out.println("Bishop legal move (c1 to c4)? " + bishop.isLegalMove(bishopIllegalMove));


        Position knightStart = new Position('b', 1);
        Position knightMove1 = new Position('c', 3);
        Position knightIllegalMove = new Position('b', 3);

        Knight knight = new Knight(knightStart);
        System.out.println(knight);
        System.out.println("Knight legal move (b1 to c3)? " + knight.isLegalMove(knightMove1));
        System.out.println("Knight legal move (b1 to b3)? " + knight.isLegalMove(knightIllegalMove));

        Position pawnStart = new Position('e', 2);
        Position pawnMove1 = new Position('e', 3);
        Position pawnMove2 = new Position('e', 4);
        Position pawnAttack = new Position('d', 3);
        Position pawnIllegalMove = new Position('e', 5);

        Pawn pawn = new Pawn(pawnStart);
        System.out.println(pawn);
        System.out.println("Pawn legal move (e2 to e3)? " + pawn.isLegalMove(pawnMove1));
        System.out.println("Pawn legal move (e2 to e4)? " + pawn.isLegalMove(pawnMove2));
        System.out.println("Pawn legal move (e2 to d3)? " + pawn.isLegalMove(pawnAttack));
        System.out.println("Pawn legal move (e2 to e5)? " + pawn.isLegalMove(pawnIllegalMove));

    }
}
