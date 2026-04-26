/*Write a program to input a number and count the number of digits. The program further checks whether the number contains odd number of digits or even number of digits.
Sample Input: 749
Sample Output: Number of digits=3
                          The number contains odd number of digits.*/
import java.io.*;
public class SC9
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER A NUMBER");
       int a = Integer.parseInt(dis.readLine());
       int i =0;
       while(a>0)
       {
           a = a / 10;
           i = i + 1;
        }
        System.out.println(" NUMBER OF DIGITS = "+i);
        System.out.println(((i%2)==0)?"The number contains even number of digits.":"The number contains odd number of digits.");;
    }
}