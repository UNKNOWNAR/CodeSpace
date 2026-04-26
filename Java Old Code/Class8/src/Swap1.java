import java.io.*;
public class Swap1
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter the first digit");
       double a = Double.parseDouble(dis.readLine());
       System.out.println("Enter the second digit");
       double b = Double.parseDouble(dis.readLine());
       a = a - b ;
       b = b + a ;
       a = b - a ;
       System.out.println("First swapped number "+a);
       System.out.println("Second swapped number"+b);
    }
}