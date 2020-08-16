package model;

import view.Square;

import java.util.LinkedList;

public class Board {

    public final LinkedList<Piece> Bpieces;
    public final LinkedList<Piece> Wpieces;
    private final Square[][] board;

    private static final String RESOURCES_WBISHOP_PNG = "wbishop.png";
    private static final String RESOURCES_BBISHOP_PNG = "bbishop.png";
    private static final String RESOURCES_WKNIGHT_PNG = "wknight.png";
    private static final String RESOURCES_BKNIGHT_PNG = "bknight.png";
    private static final String RESOURCES_WROOK_PNG = "wrook.png";
    private static final String RESOURCES_BROOK_PNG = "brook.png";
    private static final String RESOURCES_WKING_PNG = "wking.png";
    private static final String RESOURCES_BKING_PNG = "bking.png";
    private static final String RESOURCES_BQUEEN_PNG = "bqueen.png";
    private static final String RESOURCES_WQUEEN_PNG = "wqueen.png";
    private static final String RESOURCES_WPAWN_PNG = "wpawn.png";
    private static final String RESOURCES_BPAWN_PNG = "bpawn.png";

    public Board() {
        Bpieces = new LinkedList<>();
        Wpieces = new LinkedList<>();
        this.board = new Square[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int xMod = i % 2;
                int yMod = j % 2;

                if ((xMod == 0 && yMod == 0) || (xMod == 1 && yMod == 1)) {
                    board[i][j] = new Square(1, i, j);
                    //this.add(board[i][j]);
                } else {
                    board[i][j] = new Square(0, i, j);
                    //this.add(board[i][j]);
                }
            }
        }

        initializePieces();
    }

    private void initializePieces() {

        for (int i=0; i < 8; i++) {
            board[1][i].put(new Pawn(0, board[1][i], RESOURCES_WPAWN_PNG));
            board[6][i].put(new Pawn(1, board[6][i], RESOURCES_BPAWN_PNG));
        }

        board[7][3].put(new Queen(0, board[7][3], RESOURCES_WQUEEN_PNG));
        board[0][3].put(new Queen(1, board[0][3], RESOURCES_BQUEEN_PNG));

        King kw = new King(0, board[7][4], RESOURCES_WKING_PNG);
        King kb = new King(1, board[0][4], RESOURCES_BKING_PNG);
        board[7][4].put(kw);
        board[0][4].put(kb);

        board[7][2].put(new Bishop(0, board[7][2], RESOURCES_WBISHOP_PNG));
        board[0][2].put(new Bishop(1, board[0][2], RESOURCES_BBISHOP_PNG));
        board[7][5].put(new Bishop(0, board[7][5], RESOURCES_WBISHOP_PNG));
        board[0][5].put(new Bishop(1, board[0][5], RESOURCES_BBISHOP_PNG));

        board[7][1].put(new Horse(0, board[7][1], RESOURCES_WKNIGHT_PNG));
        board[0][1].put(new Horse(1, board[0][1], RESOURCES_BKNIGHT_PNG));
        board[7][6].put(new Horse(0, board[7][6], RESOURCES_WKNIGHT_PNG));
        board[0][6].put(new Horse(1, board[0][6], RESOURCES_BKNIGHT_PNG));

        board[7][0].put(new Tower(0, board[7][0], RESOURCES_WROOK_PNG));
        board[0][0].put(new Tower(1, board[0][0], RESOURCES_BROOK_PNG));
        board[7][7].put(new Tower(0, board[7][7], RESOURCES_WROOK_PNG));
        board[0][7].put(new Tower(1, board[0][7], RESOURCES_BROOK_PNG));

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 8; j++) {
                Bpieces.add(board[i][j].getPieceSquare());
                Wpieces.add(board[7 - i][j].getPieceSquare());
            }
        }
    }

    public Square getSquare(int i, int j) {
        return board[i][j];
    }

    public Square[][] getBoard() { return board; }
}
