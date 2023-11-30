package edu.guilford;

import javax.swing.JFrame;

public class ButtonDemo {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Button Demo");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonPanel myPanel = new ButtonPanel();
        myFrame.add(myPanel);
        myFrame.pack();
        myFrame.setVisible(true);

    }
}