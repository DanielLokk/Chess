package model;

public class Queen extends Piece {

    public Queen(int color, Square pos) {
        super(color, pos);
    }

    @Override
    public String toString() {
        return "QUEEN";
    }
}
