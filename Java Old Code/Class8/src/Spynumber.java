import java.io.*;
public class Spynumber
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter a number");
        int a = Integer.parseInt(dis.readLine());
        int m = 1;
        int e = 0;
         while( a  > 0)
       {
        int b = a % 10;
       m = m * b;
       e = e + b;
       a = a /10;
    }
        if ( m == e )
       {
           System.out.println("It is a spy number");
        }
        else
        {
            System.out.println("It is not a spy number");
        }
    }
}
        
    
