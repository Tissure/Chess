
//File: ChessViewer.java
//Name: Kyle Ng

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ChessViewer extends JPanel implements MouseListener {
    private ChessBoard chess_board;
    private TurnTracker turn_tracker;
    private int from_x, from_y, to_x, to_y;
    private boolean second_click;

    public ChessViewer(TurnTracker t) {
        chess_board = new ChessBoard();
        turn_tracker = t;
        second_click = false;
        from_x = 0;
        from_y = 0;
        to_x = 0;
        to_y = 0;
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        chess_board.paint(g2);
    }

    /**
     * Moves and changes turn
     */
    private void doTurn() {
        if (checkMove()) {
            chess_board.move(from_y, from_x, to_y, to_x);
            removeAll();
            repaint();
            turn_tracker.setColor();
            turn_tracker.setTurn();
        }
    }

    /**
     * Checks if Move is legal
     */
    private boolean checkMove(){
        if (chess_board.look(from_y, from_x).getColor() != turn_tracker.getColor()) {
            return false;
        }
        if(chess_board.look(from_y, from_x).getColor() == chess_board.look(to_y, to_x).getColor()){
            return false;
        }
        return true;
    }

    /**
     * @return the chess_board
     */
    public ChessBoard getChessBoard() {
        return chess_board;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        try {
            if (second_click) {
                to_x = (e.getX() / Definition.X_COORD);
                to_y = (e.getY() / Definition.Y_COORD);
                doTurn();
                second_click = !second_click;
            } else {
                from_x = (e.getX() / Definition.X_COORD);
                from_y = (e.getY() / Definition.Y_COORD);
                second_click = !second_click;
            }
            if (chess_board.look(from_y, from_x).getType() == Definition.DUMMY) {
                second_click = false;
            }
        } catch (ArrayIndexOutOfBoundsException ev) {
            second_click = false;
        }
        /*
         * System.out.println("" + from_y + from_x + to_y + to_x);
         * System.out.println(chess_board.look(from_y, from_x).getType());
         * System.out.println(second_click);
         */
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
}
