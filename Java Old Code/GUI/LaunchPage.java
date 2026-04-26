//call by creating an instance in the run opttion
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LaunchPage implements ActionListener
{
    JFrame frame  = new JFrame();
    JButton button = new JButton("NEW WINDOW");
    LaunchPage()
    {
        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);
        button.setFont(new Font("MV Boli",Font.BOLD,10));
        button.setBackground(Color.lightGray);
        button.setForeground(Color.white);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.add(button);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            new NewWindow();
        }
    }
}