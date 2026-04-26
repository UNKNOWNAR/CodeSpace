import javax.swing.*;
import java.awt.event.*;

public class Button1 extends JFrame implements ActionListener
{
    //JButton = a button thatb performs an action when clicked on
    JButton button;
    JLabel label;
    Button1()
    {
        ImageIcon img = new ImageIcon("PROJECT.jpg");
        
        label = new JLabel();
        label.setIcon(img);
        label.setBounds(250, 250, 150, 150);
        label.setVisible(false);
        
        button = new JButton();//creates button object
        button.setBounds(100, 100,250, 100);//assign button
        button.addActionListener(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)//checks if button was pressed
        {
            //System.out.println("Button was Pressed") ;
            button.setEnabled(false);//let the button be clicked only once
            label.setVisible(true);
        }
    }
}