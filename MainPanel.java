
//File: MainPanel.java
//Name: Kyle Ng

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
    public MainPanel() {
        GridBagLayout gridbag = new GridBagLayout();
        setLayout(gridbag);
        GridBagConstraints c = new GridBagConstraints();

        BorderTop top = new BorderTop();
        BorderSide side = new BorderSide();
        TurnTracker turn_tracker = new TurnTracker();
        ChessViewer viewer = new ChessViewer(turn_tracker);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = GridBagConstraints.REMAINDER;
        gridbag.setConstraints(top, c);
        add(top);

        // c.gridheight = viewer.getChessBoard().getRow() * Definition.Y_COORD;
        c.fill = GridBagConstraints.VERTICAL;
        c.ipadx = 10;
        //c.ipady = side.getHeight() * Definition.Y_COORD;
        c.gridwidth = GridBagConstraints.RELATIVE;
        c.gridheight = viewer.getChessBoard().getRow() * Definition.Y_COORD;
        gridbag.setConstraints(side, c);
        add(side);

        c.weighty = 0;
        c.ipadx = viewer.getChessBoard().getCol() * Definition.X_COORD;
        c.gridheight = viewer.getChessBoard().getRow() * Definition.Y_COORD;
        gridbag.setConstraints(viewer, c);
        add(viewer);

        c.weighty = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridheight = GridBagConstraints.REMAINDER;
        gridbag.setConstraints(turn_tracker, c);
        add(turn_tracker);

    }
}
