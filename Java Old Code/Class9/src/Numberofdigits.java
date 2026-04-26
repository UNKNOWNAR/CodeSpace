import java.io.*;
public class Numberofdigits
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
        
        System.out.println(" NUMBER OF DIGITS "+i);
    }
}