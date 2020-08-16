package model;

import javax.swing.*;
import java.awt.*;

public class Square extends JComponent {
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (this.color == 1) {
            g.setColor(new Color(221, 192, 127));
        } else {
            g.setColor(new Color(101,67,33));
        }

        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
