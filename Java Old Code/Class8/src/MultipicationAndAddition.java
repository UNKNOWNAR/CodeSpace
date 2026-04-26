import java.io.*;
public class MultipicationAndAddition
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter a two digit number");
        int a = Integer.parseInt(dis.readLine());
        int b = a % 10; 
        a =a /10 ;
        
        int m = b * a ;
        int e = b + a ;
        System.out.println("Multipication of two digits is" + m);
        System.out.println("Addition of two digits is" + e);
    }
}