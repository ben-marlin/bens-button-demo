package edu.guilford;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Dimension;

public class ButtonPanel extends JPanel {
    
    int counter = 0;
    private JButton plusButton, minusButton;
    private JTextField counterField;
    private JLabel myLabel;

    public ButtonPanel() {
        super();

        initPanel();
    }

    public void initPanel() {
        setPreferredSize(new Dimension(250, 80));
        // setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // panel just keeps the buttons next to each other
        final JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.X_AXIS));
        buttonPane.add(Box.createHorizontalGlue());
        // buttonPane.setPreferredSize(new Dimension(150,50));

        counterField = new JTextField("0",10);
        buttonPane.add(counterField);

        minusButton = new JButton("--");
        buttonPane.add(minusButton);

        plusButton = new JButton("++");
        buttonPane.add(plusButton);

        add(buttonPane);

        myLabel = new JLabel("Super Fancy Button Demo");
        add(myLabel);
    }

}
