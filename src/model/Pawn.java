package model;

public class Pawn extends Piece {

    public Pawn(int color, Square pos) {
        super(color, pos);
    }

    @Override
    public String toString() {
        return "PAWN";
    }
}
