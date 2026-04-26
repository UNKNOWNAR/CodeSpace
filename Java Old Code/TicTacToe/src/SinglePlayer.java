import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SinglePlayer implements ActionListener
{
    char play[] = new char[9];;
    int i = 0;
    int r = (int)(Math.random()*(2)+1);
    int p1 = 0;
    int p2 = 0;
    int control = -1;
    ImageIcon h = new ImageIcon("HOME.png");
    ImageIcon re = new ImageIcon("RESET.png");
    ImageIcon computerImage;
    ImageIcon playerImage;

    JFrame frame = new JFrame();

    JLabel l1 = new JLabel();
    JLabel l1a = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l2a = new JLabel();
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel();
    JLabel l5 = new JLabel();

    JButton[] buttons = new JButton[9];
    JButton home = new JButton();
    JButton reset = new JButton();

    Check ob = new Check();
    Score sc = new Score();
    String s;
    int a;
    char computerCharacter='O';
    char playerCharacter='X';
    TTTAI ai = new TTTAI(playerCharacter);

    SinglePlayer(String text, int z, char playerCharacter, char computerCharacter)
    {
        this.playerCharacter = playerCharacter;
        this.computerCharacter = computerCharacter;
        if (playerCharacter == 'X') {
            playerImage = new ImageIcon("X.png");
            computerImage = new ImageIcon("O.png");
        }
        else {
            playerImage = new ImageIcon("O.png");
            computerImage = new ImageIcon("X.png");
        }

        fill();
        s=text;
        a=z;

        l1.setBounds(0,0,100,50);
        l1.setBackground(new Color(178,102,255));
        l1.setOpaque(true);
        l1.setText(text);
        l1.setFont(new Font("MV Boli",Font.PLAIN,15));
        l1.setForeground(Color.white);

        l1a.setBounds(0,50,100,50);
        l1a.setBackground(new Color(178,102,255));
        l1a.setOpaque(true);
        l1a.setText(Integer.toString(p1));
        l1a.setFont(new Font("MV Boli",Font.PLAIN,30));
        l1a.setForeground(Color.white);

        l2.setBounds(100,0,500,100);
        l2.setBackground(Color.blue);
        l2.setOpaque(true);
        l2.setFont(new Font("MV Boli",Font.PLAIN,40));
        l2.setForeground(Color.white);

        l3.setBounds(600,0,125,50);
        l3.setBackground(new Color(178,102,255));
        l3.setOpaque(true);
        l3.setText("TTTAI");
        l3.setFont(new Font("MV Boli",Font.PLAIN,15));
        l3.setForeground(Color.white);

        l2a.setBounds(600,50,125,50);
        l2a.setBackground(new Color(178,102,255));
        l2a.setOpaque(true);
        l2a.setText(Integer.toString(p1));
        l2a.setFont(new Font("MV Boli",Font.PLAIN,30));
        l2a.setForeground(Color.white);

        l4.setBounds(100,100,500,500);
        l4.setLayout(new GridLayout(3,3,10,10));
        l4.setOpaque(true);

        home.setBounds(0,600,100,100);
        home.setBackground(Color.yellow);
        frame.add(home);
        home.addActionListener(this);
        home.setIcon(h);
        home.setFocusable(false);
        home.setVerticalAlignment(JButton.TOP);

        l5.setBounds(100,600,500,100);
        l5.setBackground(Color.orange);
        l5.setOpaque(true);
        l5.setHorizontalTextPosition(JLabel.CENTER);
        l5.setVerticalTextPosition(JLabel.CENTER);
        l5.setFont(new Font("MV Boli",Font.PLAIN,50));
        l5.setForeground(Color.white);

        reset.setBounds(600,600,125,100);
        reset.setBackground(Color.yellow);
        frame.add(reset);
        reset.addActionListener(this);
        reset.setIcon(re);
        reset.setFocusable(false);
        reset.setVerticalAlignment(JButton.TOP);

        if(z==1)
            l5.setText("  BABY MODE");
        else if(z==2)
            l5.setText("  AMATEUR MODE");
        else if(z==3)
            l5.setText("  NOVICE MODE");
        else if(z==4)
            l5.setText("  GENIUS MODE");
        if(r==1)
            l2.setText(" TTTAI'S FIRST MOVE");
        else
            l2.setText(s+" FIRST MOVE");
        for(int j=0;j<9;j++)
        {
            buttons[j] = new JButton();//creating button array
            l4.add(buttons[j]);
            buttons[j].setFocusable(false);
            buttons[j].setBackground(new Color(140,0,155));
        }
        if(r==1)
            SecondMove(0);
        for(int j=0;j<9;j++)
            buttons[j].addActionListener(this);

        frame.setTitle("SinglePlayer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.add(l1);
        frame.add(l1a);
        frame.add(l2);
        frame.add(l2a);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.getContentPane().setBackground(new Color(123,50,250));

        frame.setVisible(true);
    }
    void Check1()
    {
        if(i==9)
        {
            l5.setText("  GAME DRAWN");
            disable();
            control = 2;
        }
        else {
            int check = 0;
            check = ob.Win(play);
            boolean win = false;
            if ((check%10) == 1 && playerCharacter == 'X')
                win = true;
            else if((check%10)==2 && playerCharacter == 'O')
                win = true;
            if(win)
            {
                winLine(check);
                l5.setText(s+" WINS");
                control = 3;
            }
            else if(check!=0)
            {
                winLine(check);
                l5.setText("  TTTAI WINS");
                control = 0;
            }

        }
    }
    void winLine(int check)
    {
        check/=10;
        r=check%10;
        check/=10;
        for(i=0;i<3;i++)
        {
            buttons[r].setBackground(Color.white);
            r+=check;
        }
        disable();
    }
    void disable()
    {
        for(int j=0;j<9;j++)
            buttons[j].setEnabled(false);
    }
    void reset()
    {
        i=0;
        fill();
        ai.reset1();
        r = sc.score(control);
        p2 += r%10;
        p1 += r/10;
        l1a.setText(Integer.toString(p1));
        l2a.setText(Integer.toString(p2));
        r = (int)(Math.random()*(2)+1);
        if(a==1)
            l5.setText(" BABY MODE");
        else if(a==2)
            l5.setText(" AMATEUR MODE");
        else if(a==3)
            l5.setText(" NOVICE MODE");
        else if(a==4)
            l5.setText(" GENIUS MODE");
        if(r==1)
            l2.setText(" TTTAI'S FIRST MOVE");
        else
            l2.setText(s+" FIRST MOVE");
        control = -1;
        for(int j=0;j<9;j++)
        {
            buttons[j].setIcon(null) ;
            buttons[j].setEnabled(true);
            buttons[j].setBackground(new Color(140,0,155));
        }
        if(r==1)
            SecondMove(0);
    }
    void fill()
    {
        for(int j=0;j<9;j++)
            play[j] = ' ';
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==home)
        {
            new Home();
            frame.setVisible(false);
        }
        else if(e.getSource()==reset)
        {
            if(control == -1)
            {
                new Single();
                frame.setVisible(false);
            }
            else
                reset();
        }
        for(int j=0;j<9;j++)
        {
            if(e.getSource()==buttons[j]&&buttons[j].getText()=="")
            {
                buttons[j].setIcon(playerImage);
                buttons[j].setEnabled(false);//button disable
                buttons[j].setDisabledIcon(playerImage);//shows button icon instead of disable button
                play[j] = playerCharacter;
                i++;
                    /*two draw checker are there because different points
                    are awarded for different case*/
                if(i>=4)
                    Check1();
                if(control==-1)
                    SecondMove(j);
            }
        }
    }
    void SecondMove(int y)
    {
        if(control==-1)
        {
            int n = 0;
            int random = (int)(Math.random()*20)+1;
            if(a==1)
                n=ai.Random(play);
            else if(a==2&&random%2==0)
                n=ai.Random(play);
            else if(a==3&&random%3==0)
                n=ai.Random(play);
            else
                n = ai.input(play,r,y);
            buttons[n].setIcon(computerImage);
            buttons[n].setEnabled(false);
            buttons[n].setDisabledIcon(computerImage);
            play[n] = computerCharacter;
            i++;
        }
        if(i>=4)
            Check1();
    }
    public static void main(String[] args) {
        new SinglePlayer("Player",4, 'X', 'O');
    }
}