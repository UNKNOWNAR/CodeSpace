/*Write a program in Java to input three numbers and display the greatest and the smallest of the two numbers.
Hint: Use Math.min( ) and Math.max( )
Sample Input: 87, 65, 34
Sample Output: Greatest Number 87
Smallest number 34*/
import java.io.*;
public class MINMAX
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER A NUMBER");
       int a = Integer.parseInt(dis.readLine()); 
       System.out.println("ENTER A NUMBER");
       int b = Integer.parseInt(dis.readLine()); 
       System.out.println("ENTER A NUMBER");
       int c = Integer.parseInt(dis.readLine()); 
       int g = Math.max(a,b);
       g=Math.max(g,c);
       int s = Math.min(a,b);
       s=Math.min(s,c);
       System.out.println("Greatest Number:- "+g);
       System.out.println("Smallest Number:-"+s);
    }
}
