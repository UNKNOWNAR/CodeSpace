import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
public class Label
{
    //JLabel = a GUI display area for a string of tex,an image,a text or both
    public static void main(String args[])  
    {
        ImageIcon img = new ImageIcon("PROJECT.jpg");
        Border border = BorderFactory.createLineBorder(Color.blue,3);
        
        JLabel label = new JLabel();//create a label
        label.setText("TICTACTOE");//set text to label
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,CENTER,RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP);//set TOP,CENTER , BOTTOM of image ICON
        label.setForeground(Color.white);//set color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,50));//editing font of text
        label.setIconTextGap(-100);//set gap of text to change
        label.setBackground(new Color(123,50,250));//set background color
        label.setOpaque(true);//display background color
        label.setBorder(border);//activating border
        label.setVerticalAlignment(JLabel.CENTER);//move image and text to vertical position
        label.setHorizontalAlignment(JLabel.CENTER);//move image and text horizontal position
        /*label.setBounds(300,0,750,750);//x corodinate,y cordinate,height and width*/
        
        JFrame frame = new JFrame();//create frame object
        frame.setTitle("HyperConjugation");//set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of applicat
        frame.setSize(690,1000);//resize
        /*frame.setLayout(null);*/
        frame.setIconImage(img.getImage());//adding icon in frame
        frame.setVisible(true);//making the frame the visible
        frame.add(label);//add a label in frame
        frame.pack();
    }
}