/**/
import java.io.*;
public class SC510
{
   public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER PRICE OF ONE CALCULATOR:- ");
       double sp1 = Double.parseDouble(dis.readLine());
       System.out.println("ENTER PRICE OF SECOND CALCULATOR:- ");
       double sp2 = Double.parseDouble(dis.readLine());
       double cp1 = ((sp1*100)/(100+20));
       double cp2 = ((sp2*100)/(100-20));
       double tc = cp1 + cp2;
       System.out.println(tc);
    }
}