/**/
import java.io.*;
public class SC52
{
   public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER BASIC PAY:- ");
       double bp = Double.parseDouble(dis.readLine());
       double da = 0.3*bp;
       double hra = 0.15*bp;
       double pf = 0.125*bp;
       System.out.println("GROSS PAY:- "+(bp+da+hra));
       System.out.println("NET PAY:- "+(bp+da+hra-pf));
    }
}