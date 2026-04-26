/**/
import java.io.*;
public class SC59
{
   public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER PRINCIPAL:- ");
       double p = Double.parseDouble(dis.readLine());
       double si = (p*10*3)/100;
       double a = Math.pow((p*(11/10)),3);
       double ci = a - p;
       System.out.println("DIFFERENCE BETWEEN COMPUND INTEREST AND SIMPLE INTEREST:- "+(ci-si));
    }
}