
//File: BorderSide.java
//Name: Kyle Ng

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderSide extends JPanel {
    public BorderSide(){
        setLayout(new GridLayout(8, 1));
        
        add(new JLabel("1"));
        add(new JLabel("2"));
        add(new JLabel("3"));
        add(new JLabel("4"));
        add(new JLabel("5"));
        add(new JLabel("6"));
        add(new JLabel("7"));
        add(new JLabel("8"));
    }
}
