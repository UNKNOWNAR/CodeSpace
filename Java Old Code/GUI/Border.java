import javax.swing.*;
import java.awt.*;

public class Border
{
    public static void main(String args[])
    {
        //Layout Mnanger= defines the natural layout for components within a container
        //3 common managers
        //Border layout = A BorderLayout places components in five areas NORT,SOUTH,EAST,WEST,CENTER,
        //All extra space is placed in the center area.
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10));//create a new layout manager BorderLayout(pixel left for width, pixel left for height)
        frame.setVisible(true);
        
        JPanel panel1 = new JPanel();//creating many Java Panel
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();//creating a sub panel
        
        panel1.setBackground(Color.red);//assigning different colour to different panel
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.magenta);
        panel6.setBackground(new Color(123,50,250));
        
        panel1.setPreferredSize(new Dimension(100,100));//assigning default size
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        panel6.setPreferredSize(new Dimension(25,25));

        panel5.setLayout(new BorderLayout());//creating ayout for a panel
        
        frame.add(panel1,BorderLayout.NORTH);//adding the pannel
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.SOUTH);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5,BorderLayout.CENTER);
        panel5.add(panel6,BorderLayout.NORTH);
    }
} 