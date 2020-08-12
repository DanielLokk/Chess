package model;

public class Bishop extends Piece {

    public Bishop(int color, Square pos) {
        super(color, pos);
    }

    @Override
    public String toString() {
        return "BISHOP";
    }
}
