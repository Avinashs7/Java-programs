package swing.usage.in;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Calculator implements ActionListener {
        JTextField tf1,tf2,tf3;
        JButton b1,b2;
        public Calculator() {
                JFrame f = new JFrame();
                tf1 = new JTextField();
                tf1.setBounds(50, 100, 50, 30);
                tf2 = new JTextField();
                tf2.setBounds(50, 150, 50, 30);
                tf3 = new JTextField();
                tf3.setBounds(50, 200, 50, 30);
                b2 = new JButton("+");
                b2.setBounds(100, 50, 50, 20);
                b1 = new JButton("-");
                b1.setBounds(150, 50, 50, 20);

                b1.addActionListener(this);
                b2.addActionListener(this);
                f.add(tf1);
                f.add(tf2);
                f.add(tf3);
                f.add(b1);
                f.add(b2);
                f.setSize(300, 300);
                f.setLayout(null);
                f.setVisible(true);
        }
        public void actionPerformed(ActionEvent e)
        {
                String input = tf1.getText();
                String input2 = tf2.getText();
                int a =Integer.parseInt(input);
                int b =Integer.parseInt(input2);
                int c=0;
                if(e.getSource()==b1)
                        c=a-b;
                else if(e.getSource()==b2)
                        c=a+b;
                String result =String.valueOf(c);
                tf3.setText(result);
        }

}
