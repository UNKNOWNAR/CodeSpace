/*Write a program to input a number and evaluate the results based on the number entered by the user:
(a) Natural logarithm of the number
(b) Absolute value of the number
(c) Square root of the number
(d) Cube of the number
(e) Random numbers between 0 (zero) and 1 (one).*/
import java.io.*;
public class Result
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER A NUMBER");
       double a = Double.parseDouble(dis.readLine()); 
       System.out.println("Natural logarithm = " + Math.log(a));
       System.out.println("Absolute value = " + Math.abs(a));
       System.out.println("Square root = " + Math.sqrt(a));
       System.out.println("Cube root= " + Math.cbrt(a));
       System.out.println("Random number = " + Math.random());
    }
}
       