import java.awt.Graphics2D;
import javax.swing.JPanel;

//File: board.java
//Name: Kyle Ng

public abstract class Board {
    protected Piece[][] board;
    protected Background[][] the_background;
    private int row, col;

    /**
     * Default Consctructor
     */
    public Board() {
        row = 8;
        col = 8;
        board = new Piece[row][col];
        the_background = new Background[row][col];
    }

    /**
     * Custom Constructor
     */
    public Board(int row, int col) {
        this.row = row;
        this.col = col;
        board = new Piece[row][col];
        the_background = new Background[row][col];
    }

    abstract void start();

    /**
     * Places piece in the given spot
     * 
     * @param piece
     * @param row
     * @param col
     */
    public void place(Piece piece, int row, int col) {
        board[row][col] = piece;
    }

    /**
     * Moves Piece from given spot
     * 
     * @param from_row
     * @param from_column
     * @param to_row
     * @param to_column
     */
    public void move(int from_row, int from_column, int to_row, int to_column) {
        try {
            Piece tmp = look(from_row, from_column);
            // Only moves non dummy pieces
            if (tmp.getType() != Definition.DUMMY) {
                //Only changes if coodinates are different
                if (from_row != to_row || from_column != to_column) {
                    place(tmp, to_row, to_column);
                    tmp.place(to_row, to_column);
                    remove(from_row, from_column);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //catches error
        }
    }

    /**
     * Replaces given piece with Dunny
     * 
     * @param row
     * @param col
     */
    private void remove(int row, int col) {
        board[row][col] = new DummyPiece(row, col);
    }

    /**
     * Returns Piece at given row,col
     * 
     * @param row
     * @param col
     * @return Piece at given row,col
     */
    public Piece look(int row, int col) {
        return board[row][col];
    }

    /**
     * @return num of rows
     */
    public int getRow() {
        return row;
    }

    /**
     * @return num of cols
     */
    public int getCol() {
        return col;
    }

    /**
     * Creates checkered board
     */
    public void createBoard() {
        boolean color = true; // true for white, false for black
        for (int y = 0; y < the_background.length; y++) {
            for (int x = 0; x < the_background[y].length; x++) {
                if (color) {
                    the_background[y][x] = new Background(Definition.WHITE, x * Definition.X_COORD,
                            y * Definition.Y_COORD);
                    color = !color;
                } else {
                    the_background[y][x] = new Background(Definition.BLACK, x * Definition.X_COORD,
                            y * Definition.Y_COORD);
                    color = !color;
                }
            }
            color = !color; // Ensures checkered pattern
        }
    }

    /**
     * Paints the_background
     * 
     * @param g2
     */
    public void paint(Graphics2D g2) {
        for (Background[] row : the_background) {
            for (Background b : row) {
                b.paint(g2);
            }
        }
        for (Piece[] row : board) {
            for (Piece piece : row) {
                piece.paint(g2);
            }
        }
    }

}
