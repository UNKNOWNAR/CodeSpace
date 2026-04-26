/*In order to reach the top of a pole, a monkey in his first attempt reaches to a height of 5 feet and in the subsequent jumps, he slips down by 2% of the height attained in the previous jump. The process repeats and finally the monkey reaches the top of the pole. Write a program to input height of the pole. Calculate and display the number of attempts the monkey makes to reach the top of the pole.*/
import java.io.*;
public class SC13
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Height:-");
       double h = Double.parseDouble(dis.readLine());
       int a = 1;
       int i = 1;
       int ha = 5;
       while(h>=ha)
       {
           ha *= 0.98;
           ha += 5;
           i++;
        }
       System.out.println("No of Attempt needed"+i);
    }
}       