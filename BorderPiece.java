
//File: BorderPiece.java
//Name: Kyle Ng
//Student ID: 100296955

import java.awt.Graphics2D;

public class BorderPiece extends Piece {
    private String character;

    /**
     * Constructs Border
     */
    public BorderPiece(String c, int row, int col) {
        super();
        character = c;
        place(row, col);
    }

    @Override
    public int getType() {
        return Definition.BORDER;
    }

    @Override
    public void paint(Graphics2D g2) {
        g2.drawString(character, getX(), getY());
    }
}