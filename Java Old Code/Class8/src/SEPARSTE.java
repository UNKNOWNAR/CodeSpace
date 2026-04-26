import java.io.*;
public class SEPARSTE
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("number");
       int a = Integer.parseInt(dis.readLine());
       
       while( a  > 0)
       {
        int b = a % 10;
       System.out.println( b  );
       a = a /10;
    }
       
    }
}