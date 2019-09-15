
//File: HighlightPiece.java
//Name: Kyle Ng

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;

public class HighlightPiece extends Piece implements MouseListener {
    private BufferedImage img;
    private int x, y;
    private boolean isclicked;

    /**
     * Constructs Highlight
     */
    public HighlightPiece(int row, int col, int piece) {
        super();
        isclicked = false;
        x = col * Definition.X_COORD;
        y = row * Definition.Y_COORD;
        place(row, col);
        try {
            switch (piece) {
            case 1:
                img = ImageIO.read(new File(Definition.IMG_PAWN_HIGHLIGHT));
                break;
            case 2:
                img = ImageIO.read(new File(Definition.IMG_KNIGHT_HIGHLIGHT));
                break;
            case 3:
                img = ImageIO.read(new File(Definition.IMG_BISHOP_HIGHLIGHT));
                break;
            case 4:
                img = ImageIO.read(new File(Definition.IMG_ROOK_HIGHLIGHT));
                break;
            case 5:
                img = ImageIO.read(new File(Definition.IMG_QUEEN_HIGHLIGHT));
                break;
            case 6:
                img = ImageIO.read(new File(Definition.IMG_KING_HIGHLIGHT));
                break;
            }
        } catch (IOException e) {
            // nothing
        }
    }

    @Override
    public int getType() {
        return Definition.HIGHLLIGHT;
    }

    @Override
    public void paint(Graphics2D g2) {
        g2.drawImage(img, x, y, img.getWidth(), img.getHeight(), null);
    }
}
