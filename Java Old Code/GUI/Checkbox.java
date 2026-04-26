import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Checkbox extends JFrame implements ActionListener{
    //JCheckBox = A GUI componenent that can be selected or deselected
     JButton button;
    JCheckBox checkBox;
    Checkbox()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("SUBMIT");
        button.addActionListener(this);
        checkBox = new JCheckBox();
        checkBox.setText("I am not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("MV Boli",Font.PLAIN,50));

        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Checkbox();
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)
        {
            if(checkBox.isSelected())
            {
                System.out.println("You can join the humans");
            }
        }
    }
}