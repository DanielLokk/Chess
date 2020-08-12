package model;

public class Horse extends Piece {

    public Horse(int color, Square pos) {
        super(color, pos);
    }

    @Override
    public String toString() {
        return "HORSE";
    }
}
