import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.BorderFactory;
public class Button2 extends JFrame
{
    //JButton = a button thatb performs an action when clicked on
    JButton button;
    JButton button1;
    Button2()
    {
        ImageIcon img = new ImageIcon("OIP.jpeg");//creating image object
        
        button = new JButton();//creates button object
        button.setBounds(150, 75,200, 100);//assign button
        button.addActionListener(e -> System.out.println("BABY MODE ACTIVATED"));//calls button without much code
        button.setText("BABY MODE");
        button.setFont(new Font("MV Boli",Font.BOLD,10));
        button.setFocusable(false);
        button.setIcon(img);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setBackground(Color.lightGray);
        button.setForeground(Color.white);
        button.setBorder(BorderFactory.createEtchedBorder());
        
        button1 = new JButton();//creates button object
        button1.setBounds(150, 325,200, 100);//assign button
        button1.addActionListener(e -> System.out.println("EASY MODE ACTIVATED"));//calls button without much code
        button1.setText("EASY MODE");
        button1.setFont(new Font("MV Boli",Font.PLAIN,10));
        button.setFocusable(false);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(button1);
    }
}