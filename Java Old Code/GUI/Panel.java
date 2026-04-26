import javax.swing.*;
import java.awt.*;
public class Panel
{
    public static void main(String args[])
    {
        ImageIcon img = new ImageIcon("PROJECT.jpg");//create Image object
        
        JLabel label = new JLabel();//create a label
        label.setText("TICTACTOE");//set text to label
        label.setIcon(img);
        //JPanel = a GUI component thta function as a container to hold other components
        JPanel panel1 =new JPanel();
        panel1.setBackground(new Color(123,50,250));//set background color
        panel1.setBounds(0,0, 250,250);//assigning panel position
        
        JPanel panel2 =new JPanel();
        panel2.setBackground(Color.blue);//set background color
        panel2.setBounds(250,0, 250,250);//assigning panel position
        
        JFrame frame = new JFrame();//create frame object
        label.setFont(new Font("MV Boli",Font.PLAIN,25));
        label.setIconTextGap(-20);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        frame.setIconImage(img.getImage());//change icon of frame
        frame.setTitle("TIC TAC TOE");//set title of frame
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setSize(750,750);//sets x-dimension, and y-dimensions of frame
        panel1.add(label);
        frame.add(panel1);//adding panel to frame
        frame.add(panel2);
        frame.setVisible(true);//make frame visible
    }
}
