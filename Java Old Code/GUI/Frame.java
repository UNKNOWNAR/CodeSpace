import javax.swing.*;
import java.awt.*;
public class Frame
{
    //JFrame = a GUI window to add components to
    public static void main(String args[])
    {
        JFrame frame = new JFrame();//create frame object
        frame.setTitle("TITLE");//set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setResizable(false);//prevent frame from being resized
        frame.setSize(690,1000);//sets x-dimension, and y-dimensions of frame
        frame.setVisible(true);//make frame visible
        ImageIcon image = new ImageIcon("PROJECT.jpg");//create Image object
        frame.setIconImage(image.getImage());//change icon of frame
        /*frame.getContentPane().setBackground(Color.green);//change colour of frame*/
        frame.getContentPane().setBackground(new Color(123,50,250));//change colour of frame
    }
}