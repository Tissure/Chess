//File: DummyPiece.java
//Name: Kyle Ng

import java.awt.Graphics2D;

public class DummyPiece extends Piece {
    /**
     * Constructs Dummy
     */
    public DummyPiece(int row, int col) {
        super();
        place(row, col);
    }

    @Override
    public int getType() {
        return Definition.DUMMY;
    }

    @Override
    public void paint(Graphics2D g2) {
        //Do nothing
    }
}
