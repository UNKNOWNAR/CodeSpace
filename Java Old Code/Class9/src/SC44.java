import java.io.*;
public class SC44
{
   public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER FIRST NUMBER :- ");
       double n1  = Double.parseDouble(dis.readLine());
       System.out.println("ENTER SECOND NUMBER :- ");
       double n2  = Double.parseDouble(dis.readLine());       
       double diff = Math.abs(n1-n2);
       diff = diff*100/n1;
       System.out.println(diff+"%");
    }
}