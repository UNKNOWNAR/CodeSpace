import java.io.*;
public class FirstAndLast
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER A NUMBER");
       int num = Integer.parseInt(dis.readLine());
       int num1 = num;
       int lastDigit = num % 10;
       int i =0;
       while(num>0)
       {
           num = num / 10;
           i = i + 1;
        }
       int d = (int)Math.pow(10,(i-1));
       int firstDigit = num1/d;
       System.out.println("First digit of " +num1+ " is " +firstDigit);
       System.out.println("Last digit of " +num1+ " is " +lastDigit);
    }
}