import javax.swing.*;

public class JOPane
{
    public static void main(String[] args) {
        //JOptionPane = pop up a standard dialog box that prompts users for a value
        // or informs them of something.
        //JOptionPane.showMessageDialog(null, "HELLO","Title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "INFORMATION","Title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "QUESTION","Title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "VIRUS DETECTED","Title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "SOMETHING WENT WRONG","Title", JOptionPane.ERROR_MESSAGE);

        //int ans = JOptionPane.showConfirmDialog(null, "Coding is Fun", "Title",JOptionPane.YES_NO_CANCEL_OPTION);
        /*String name = JOptionPane.showInputDialog("What is Your Name?");
        System.out.println("Hello " + name);*/
        ImageIcon img = new ImageIcon("OIP.jpeg");
        String[] responses = {"HI","HELLO","WELCOME","BYE"};
        JOptionPane.showOptionDialog(null, "WELCOME", "TITLE", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,img,responses,0);

    }
}
