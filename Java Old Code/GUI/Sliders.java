import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Sliders implements ChangeListener,ActionListener
{
    /*JSlider is a GUI component that lets user enter a value by using
           an adjustable sliding knob on a track*/
    JFrame frame = new JFrame("Sliders");
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JButton button = new JButton("OK");
    JSlider slider = new JSlider(2,8,5);//JSlider slider = new JSlider(minimum no,maximum no,starting no);
    Sliders()
    {
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);//adding small positions like numbers on a number line
        //slider.setMinorTickSpacing(1); //gives minimum spacing with small ticks
        
        slider.setPaintTrack(true);//enables the bigger ticks
        slider.setMajorTickSpacing(2);//gives maximum ticks
        
        //slider.setPaintLabels(true);//display the numbers
        //slider.setFont(new Font("MV Boli",Font.BOLD,10)); setting font 
        
        //slider.setOrientation(SwingConstants.VERTICAL); change orientation of slider to VERTICAL
        //slider.setOrientation(SwingConstants.HORIZONTAL); change orientation of slider to HORIZONTAL
        
        label.setFont(new Font("MV Boli",Font.BOLD,30));
        label.setText("CHOOSE A MODE");
        
        slider.addChangeListener(this);//calling to change the slider
        
        button.setFocusable(false);
        button.setBackground(Color.yellow);
        
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        panel.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
    }
    public void stateChanged(ChangeEvent e)
    {
        switch(slider.getValue())
        {
            case 2:
            button.addActionListener(this);
            label.setText("BABY MODE");
            break;
            case 4:
            button.addActionListener(this);
            label.setText("AMATURE MODE");
            break;
            case 6:
            button.addActionListener(this);
            label.setText("GENIUS MODE");
            break;
            case 8:
            button.addActionListener(this);
            label.setText("IMPOSSIBLE MODE");
            break;
            /*default:
            label.setText("CHOOSE A MODE");*/
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)//checks if button was pressed
        {
            //System.out.println("Button was Pressed") ;
            button.setEnabled(false);//let the button be clicked only once
            System.out.println(slider.getValue());
        }
    }
}