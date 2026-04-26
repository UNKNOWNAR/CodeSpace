import javax.swing.*;
import java.awt.*;
public class LayeredPane
{
    public static void main(String args[])
    {
        //JLayeredPane = Swing container that provides a third dimension
                         //for positioning components ex:-depth z-index
        JLabel l1 = new JLabel();
        l1.setOpaque(true);
        l1.setBackground(Color.RED);
        l1.setBounds(50,50,200,200);
        
        JLabel l2 = new JLabel();
        l2.setOpaque(true);
        l2.setBackground(Color.BLUE);
        l2.setBounds(100,100,200,200);
        
        JLabel l3 = new JLabel();
        l3.setOpaque(true);
        l3.setBackground(Color.GREEN);
        l3.setBounds(150,150,200,200);
        
        JLayeredPane pane = new JLayeredPane();//creating layered pane object
        pane.setBounds(0,0,400,400);
        pane.add(l1, Integer.valueOf(0));//the higher the number it will be placed on top of the lower counterparts
        pane.add(l2, Integer.valueOf(1));
        pane.add(l3, Integer.valueOf(2));
        
        JFrame frame = new JFrame();//create frame object
        frame.add(pane);
        frame.setTitle("PANE");//set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setResizable(false);//prevent frame from being resized
        frame.setLayout(null);
        frame.setSize(500,500);//sets x-dimension, and y-dimensions of frame
        frame.setVisible(true);
    }
}