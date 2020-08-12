package model;

public class Square {
    private Piece piece;
    private boolean isPiece = false;

    public Square(Piece piece, boolean isPiece) {
        this.piece = piece;
        this.isPiece = isPiece;
    }

    public void put(Piece piece) {
        this.piece = piece;
        isPiece = true;
    }

    public Piece getPieceSquare() {
        return piece;
    }
}
