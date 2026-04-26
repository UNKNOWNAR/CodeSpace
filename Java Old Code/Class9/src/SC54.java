/**/
import java.io.*;
public class SC54
{
   public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER THE PRICE :- ");
       double p = Double.parseDouble(dis.readLine());
       double dp1 = (p*7)/10;
       double dp2 = (p*8*9)/(100);
       System.out.println("PRICE AFTER 30 % DISCOUNT "+dp1);
       System.out.println("PRICE AFTER 20 % AND 10 % SUCCESSIVE DISCOUNT "+dp2); 
    }
}      