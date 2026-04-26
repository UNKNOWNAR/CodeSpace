/**/
import java.io.*;
public class SC57
{
   public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER TIME IN SECOND :- ");
       int ts  = Integer.parseInt(dis.readLine());
       int s = ts%60;
       int m = ts/60;
       int h = m/60;
       m = m - h*60;
       System.out.println("TIME :- "+h+" hours "+m+" minutes "+s+ " seconds"); 
    }
} 