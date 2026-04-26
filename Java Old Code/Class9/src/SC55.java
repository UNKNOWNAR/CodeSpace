/**/
import java.io.*;
public class SC55
{
   public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER PRINCIPAL:- ");
       double p = Double.parseDouble(dis.readLine());
       double i = (p*5)/100;
       System.out.println("INTEREST IN FIRST YEAR:- "+i);
       p += i;
       i = (p*5)/100;
       System.out.println("INTEREST IN SECOND YEAR:- "+i);
       p += i;
       i = (p*5)/100;
       System.out.println("INTEREST IN THIRD YEAR:- "+i);
    }
} 