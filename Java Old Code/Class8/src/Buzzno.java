import java.io.*;
public class Buzzno
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter the first digit");
       int a = Integer.parseInt(dis.readLine());
       int b = a % 7;
       int c = a % 10;
       if ( b == 0 || c == 7 )
       {
           System.out.println("It is a buzz number");
        }
        else
        {
            System.out.println("It is not a buzz number");
        }
    }
}