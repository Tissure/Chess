
//File: TurnTracker.java
//Name: Kyle Ng

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TurnTracker extends JPanel {
    private String label;
    private char color;

    public TurnTracker() {
        color = Definition.WHITE;
        setTurn();
    }

    public void setTurn() {
        removeAll();
        if (color == Definition.WHITE) {
            label = (Definition.WHITE_STRING + " Turn");
        } else {
            label = (Definition.BLACK_STRING + " Turn");
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("TimesNewRoman", Font.PLAIN, 20));
        g.setColor(Color.RED);
        g.drawString(label, Definition.X_COORD, Definition.Y_COORD);
    }

    /**
     * @param color the color to set
     */
    public void setColor() {
        if (color == Definition.WHITE) {
            color = Definition.BLACK;
        } else {
            color = Definition.WHITE;
        }
    }

    /**
     * @return the color
     */
    public char getColor() {
        return color;
    }
}
