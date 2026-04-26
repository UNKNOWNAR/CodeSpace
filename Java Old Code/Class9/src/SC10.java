/*Write a program to input a number and display the new number after reversing the digits of the original number. The program also displays the absolute difference between the original number and the reversed number.
Sample Input: 194
Sample Output: 491
Absolute Difference= 297*/
import java.io.*;
public class SC10
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("number");
       int a = Integer.parseInt(dis.readLine());
       int x=a;
       int j = 0 ;
       while( a  > 0)
       {
        int b = a % 10;
        a = a /10;
        j = j * 10 + b; 
       }
       System.out.println( j);
       int d = (x>j)?x-j:j-x;
       System.out.println("Absolute Difference = "+d);
    }
}