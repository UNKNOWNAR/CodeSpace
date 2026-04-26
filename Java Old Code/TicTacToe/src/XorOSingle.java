import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XorOSingle extends JFrame implements ActionListener {
    JLabel label = new JLabel();
    JButton buttonX = new JButton();
    JButton buttonO = new JButton();

    char playerChar;
    char computerChar;
    String text;
    int z;
    XorOSingle(String text, int z)
    {
        this.text= text;
        this.z= z;
        ImageIcon iconX = new ImageIcon("X.png");
        ImageIcon iconO = new ImageIcon("O.png");

        label.setBounds(225, 25, 250, 100);
        label.setText("Choose X or O");
        label.setFont(new Font("MV Boli", Font.PLAIN, 30));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        buttonX.setBounds(125, 250, 200, 200);
        buttonX.setIcon(iconX);
        buttonX.addActionListener(this);

        buttonO.setBounds(375, 250, 200, 200);
        buttonO.setIcon(iconO);
        buttonO.addActionListener(this);
        setTitle("Choose X or O");
        setSize(750, 750);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(label);
        add(buttonX);
        add(buttonO);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonX) {
            playerChar = 'X';
            computerChar = 'O';
        }
        else if (e.getSource() == buttonO) {
            playerChar = 'O';
            computerChar = 'X';
        }
        setVisible(false);
        new SinglePlayer(text, z, playerChar, computerChar);
    }
}