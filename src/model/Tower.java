package model;

public class Tower extends Piece {

    public Tower(int color, Square pos) {
        super(color, pos);
    }

    @Override
    public String toString() {
        return "TOWER";
    }
}
