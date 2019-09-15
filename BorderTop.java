
//File: Borderjava
//Name: Kyle Ng
//StudentID: 100296955

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderTop extends JPanel {
    public BorderTop(){
        setLayout(new GridLayout(1,8));
        add(new JLabel("   "));
        add(new JLabel("a"));
        add(new JLabel("b"));
        add(new JLabel("c"));
        add(new JLabel("d"));
        add(new JLabel("e"));
        add(new JLabel("f"));
        add(new JLabel("g"));
        add(new JLabel("h"));
    }
}