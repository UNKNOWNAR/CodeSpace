/**/
import java.io.*;
public class SC51
{
   public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER LENGTH OF A PENDULAM:- ");
       double l = Double.parseDouble(dis.readLine());
       System.out.println("ENTER ACCELERATION DUE TO GRAVITY:- ");
       double g = Double.parseDouble(dis.readLine());
       double T = (44*(Math.sqrt(l/g)))/7;
       System.out.println("TIME PERIOD:- "+T);
    }
}