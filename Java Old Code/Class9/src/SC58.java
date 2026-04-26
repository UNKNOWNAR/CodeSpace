/**/
import java.io.*;
public class SC58
{
   public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       int a = 23;
       int b = 56;
       a = a + b;
       b = a - b;
       a = a - b;
       System.out.println(a);
       System.out.println(b);
    }
}