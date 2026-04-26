import java.awt.*;
import javax.swing.*;
public class Gridlayout
{
    public static void main(String args[])
    {
        // Grid Layout = places components in a grid of cells
        /*Each compomnent in a grid of cells. Each components takes all the availaible within its cell,
         *and each cell is same size*/
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3,3,10,10));//creating new Layout Manager(rows,coulmn,horizontal spaces,vertical spaces) 
        
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        
        frame.setVisible(true);
    }
}