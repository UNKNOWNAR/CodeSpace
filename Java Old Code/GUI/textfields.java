import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class textfields implements ActionListener
{
    //JTextFields = A GUI textbox component that can ber used to add,set or get text
    JFrame frame  = new JFrame();
    JTextField tf = new JTextField();
    JButton b = new JButton();
    textfields()
    {
        b.addActionListener(this);
        
        tf.setPreferredSize(new Dimension (250,40));
        tf.setFont(new Font("MV Boli",Font.BOLD,20));
        tf.setText("USERNAME");
        
        frame.add(tf);
        frame.add(b);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());//using flowlayout
        frame.setSize(420,420);
        frame.pack();//packing all of them together
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            System.out.println("Hello "+tf.getText());
            b.setEnabled(false);
            tf.setEnabled(false);
        }
    }
}