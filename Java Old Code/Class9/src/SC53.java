/**/
import java.io.*;
public class SC53
{
   public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER PRINTED PRICE OF CAMERA:- ");
       double p = Double.parseDouble(dis.readLine());
       double dp = p * 0.9;
       System.out.println("PRICE OF CAMERA:- "+(1.06*dp));
    }
}