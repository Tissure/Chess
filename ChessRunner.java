import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class ChessRunner {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new MainPanel());

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static final int FRAME_WIDTH = 900;
    private static final int FRAME_HEIGHT = 600;
}
