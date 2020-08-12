package model;

public class Square {
    private Piece piece;
    private boolean isPiece = false;
    private int color;

    private int posX;
    private int posY;

    public Square(int color, int posX, int posY) {
        this.color = color;
        this.isPiece = false;
        this.posX = posX;
        this.posY = posY;
    }

    public void put(Piece piece) {
        this.piece = piece;
        isPiece = true;
    }

    public Piece getPieceSquare() {
        return piece;
    }
}
