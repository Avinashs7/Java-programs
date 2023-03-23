package applet.usage.in;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Myapplet {

    public Myapplet() {
        JFrame f = new JFrame("An event example");
        f.setLayout(new FlowLayout());
        f.setSize(150, 150);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton button = new JButton("Press for magic");

        JLabel label = new JLabel("Press");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                label.setText("Button was pressed");
            }
        });
        f.add(button);
        f.add(label);
        f.setVisible(true);
    }
}
