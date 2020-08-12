package model;

import java.util.LinkedList;

public class Board {

    public final LinkedList<Piece> Bpieces;
    public final LinkedList<Piece> Wpieces;
    private final Square[][] board;

    public Board() {
        Bpieces = new LinkedList<>();
        Wpieces = new LinkedList<>();
        this.board = new Square[8][8];
    }

    private void initializePieces() {

        for (int i=0; i < 8; i++) {
            board[1][i].put(new Pawn(0, board[1][i]));
            board[6][i].put(new Pawn(1, board[6][i]));
        }

        board[7][3].put(new Queen(0, board[7][3]));
        board[0][3].put(new Queen(1, board[0][3]));

        King kw = new King(0, board[7][4]);
        King kb = new King(1, board[0][4]);
        board[7][4].put(kw);
        board[0][4].put(kb);

        board[7][2].put(new Bishop(0, board[7][2]));
        board[0][2].put(new Bishop(1, board[0][2]));
        board[7][5].put(new Bishop(0, board[7][5]));
        board[0][5].put(new Bishop(1, board[0][5]));

        board[7][1].put(new Horse(0, board[7][1]));
        board[0][1].put(new Horse(1, board[0][1]));
        board[7][6].put(new Horse(0, board[7][6]));
        board[0][6].put(new Horse(1, board[0][6]));

        board[7][0].put(new Tower(0, board[7][0]));
        board[0][0].put(new Tower(1, board[0][0]));
        board[7][7].put(new Tower(0, board[7][7]));
        board[0][7].put(new Tower(1, board[0][7]));

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                Bpieces.add(board[i][j].getPieceSquare());
                Wpieces.add(board[7-i][j].getPieceSquare());
            }
        }
    }
}
