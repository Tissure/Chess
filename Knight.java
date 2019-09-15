
//File: Knight.java
//Name: Kyle Ng

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;

public class Knight extends Piece {
    private BufferedImage img;

    /**
     * Constructs Knight
     */
    public Knight(char color, int row, int col) {
        super(color);
        place(row, col);
        try {
            if (getColor() == Definition.BLACK) {
                img = ImageIO.read(new File(Definition.IMG_KNIGHT_BLACK));
            }
            if (getColor() == Definition.WHITE) {
                img = ImageIO.read(new File(Definition.IMG_KNIGHT_WHITE));
            }
        } catch (IOException e) {
            // nothing
        }
    }

    @Override
    public int getType() {
        return Definition.KNIGHT;
    }

    @Override
    public void paint(Graphics2D g2) {
        g2.drawImage(img, getX(), getY(), img.getWidth(), img.getHeight(), null);
    }
}
