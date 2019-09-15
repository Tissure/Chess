
//File: ChessBoard.java
//Name: Kyle Ng
//Student ID: 100296955



public class ChessBoard extends Board {

    public ChessBoard() {
        super(8, 8);
        start();
    }

    /**
     * Places all pieces in starting positions
     */
    public void start() {
        createBoard();
        // Place Dummies
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                place(new DummyPiece(i, j), i, j);
            }
        }

        // place black pieces
        place(new Rook(Definition.BLACK, 0, 0), 0, 0);
        place(new Knight(Definition.BLACK, 0, 1), 0, 1);
        place(new Bishop(Definition.BLACK, 0, 2), 0, 2);
        place(new Queen(Definition.BLACK, 0, 3), 0, 3);
        place(new King(Definition.BLACK, 0, 4), 0, 4);
        place(new Bishop(Definition.BLACK, 0, 5), 0, 5);
        place(new Knight(Definition.BLACK, 0, 6), 0, 6);
        place(new Rook(Definition.BLACK, 0, 7), 0, 7);
        for (int x = 0; x < board[1].length; x++) {
            place(new Pawn(Definition.BLACK, 1, x), 1, x);
        }
        // place white pieces
        place(new Rook(Definition.WHITE, 7, 0), 7, 0);
        place(new Knight(Definition.WHITE, 7, 1), 7, 1);
        place(new Bishop(Definition.WHITE, 7, 2), 7, 2);
        place(new Queen(Definition.WHITE, 7, 3), 7, 3);
        place(new King(Definition.WHITE, 7, 4), 7, 4);
        place(new Bishop(Definition.WHITE, 7, 5), 7, 5);
        place(new Knight(Definition.WHITE, 7, 6), 7, 6);
        place(new Rook(Definition.WHITE, 7, 7), 7, 7);
        for (int x = 0; x < board[6].length; x++) {
            place(new Pawn(Definition.WHITE, 6, x), 6, x);
        }
    }
}