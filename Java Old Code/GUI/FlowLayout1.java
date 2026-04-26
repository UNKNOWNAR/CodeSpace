import java.awt.*;
import javax.swing.*;

public class FlowLayout1
{
    public static void main(String args[])
    {
        //Layout Mnanager = Defines the natural layout for components within a container
        //FlowLayout  = places components in a row, sized at their preferred size
        //              If the horizontal container is too small the FlowLayout class 
        //              uses the next availaible row.
        // we can also use panel instead of frame
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        /*frame.setLayout(new FlowLayout(FlowLayout.LEADING));//stick to left side*/
        /*frame.setLayout(new FlowLayout(FlowLayout.TRAILING));//stick to right side*/
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));//stick to the center default setting
        //CENTER(x,y) x-> horizontal spacing -> vertical spacing default (0,0)
        
        frame.add(new JButton("1"));//adding and naming the button
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));
        frame.add(new JButton("11"));
        frame.add(new JButton("12"));
        frame.add(new JButton("13"));
        frame.add(new JButton("14"));
        frame.add(new JButton("15"));
        frame.add(new JButton("16"));
        frame.add(new JButton("17"));
        frame.add(new JButton("18"));
        
        
        frame.setVisible(true);
    }
}