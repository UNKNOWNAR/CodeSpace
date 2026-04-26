
import java.io.*;
public class SC43
{
   public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER % OF CORRECT ANSWER :- ");
       double ca  = Double.parseDouble(dis.readLine());
       double nc = 150 * ca / 100;
       System.out.println(nc);
    }
}