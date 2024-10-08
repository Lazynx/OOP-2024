package lab2.task2;

public class ChessTest {
    public static void main(String[] args) {
        King blackKing = new King(new Position('a', 8));
        Queen whiteQueen = new Queen(new Position('d', 1));
        Rook whiteRook = new Rook(new Position('h', 1));
        Bishop blackBishop = new Bishop(new Position('f', 8));
        Knight whiteKnight = new Knight(new Position('g', 1));
        Pawn whitePawn = new Pawn(new Position('c', 2));

        System.out.println("King moving from E8 to E7: " + blackKing.isLegalMove(new Position('e', 7)));
        System.out.println("Queen moving from D1 to H5: " + whiteQueen.isLegalMove(new Position('h', 5)));
        System.out.println("Rook moving from H1 to H4: " + whiteRook.isLegalMove(new Position('h', 4)));
        System.out.println("Bishop moving from F8 to A3: " + blackBishop.isLegalMove(new Position('a', 3)));
        System.out.println("Knight moving from G1 to F3: " + whiteKnight.isLegalMove(new Position('f', 3)));
        System.out.println("Pawn moving from C2 to C4: " + whitePawn.isLegalMove(new Position('c', 4)));

        System.out.println("\nKing moving from E8 to E6: " + blackKing.isLegalMove(new Position('e', 6)));
        System.out.println("Queen moving from D1 to D6 (jumping over pieces): " + whiteQueen.isLegalMove(new Position('d', 6)));
        System.out.println("Rook moving from H1 to G2 (diagonal move): " + whiteRook.isLegalMove(new Position('g', 2)));
        System.out.println("Bishop moving from F8 to F7 (vertical move): " + blackBishop.isLegalMove(new Position('f', 7)));
        System.out.println("Knight moving from G1 to G3 (invalid L-shape move): " + whiteKnight.isLegalMove(new Position('g', 3)));
        System.out.println("Pawn moving from C2 to C5 (illegal double move): " + whitePawn.isLegalMove(new Position('c', 5)));

        Position capturePosition = new Position('d', 4);
        System.out.println("\nQueen capturing at D4: " + whiteQueen.isLegalMove(capturePosition));

        Position edgePosition = new Position('a', 8);
        System.out.println("Rook moving to edge A8: " + whiteRook.isLegalMove(edgePosition));
    }
}
