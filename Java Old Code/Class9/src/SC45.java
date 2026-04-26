import java.io.*;
public class SC45
{
   public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER TEMPERATURE IN FARHENITE :- ");
       double f  = Double.parseDouble(dis.readLine());
       double c = (5*f - 160)/9;
       System.out.println("TEMPERATURE IN CELSIUS :- "+c);
    }
}