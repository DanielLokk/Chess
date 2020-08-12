package model;

public class King extends Piece {

    public King(int color, Square pos) {
        super(color, pos);
    }

    @Override
    public String toString() {
        return "KING";
    }
}
