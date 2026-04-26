import java.io.*;
public class REVERSE
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("number");
       int a = Integer.parseInt(dis.readLine());
       int j = 0 ;
       while( a  > 0)
       {
        int b = a % 10;
        a = a /10;
        j = j * 10 + b; 
       }
       System.out.println( j);
       
    }
}