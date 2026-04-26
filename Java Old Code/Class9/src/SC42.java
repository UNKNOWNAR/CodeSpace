
import java.io.*;
public class SC42
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       int i = 5;
       while(i==5)
       {
           System.out.println("Enter Number Of Days Present:- ");
           int np = Integer.parseInt(dis.readLine());
           System.out.println("Enter Number Of Days Absent:- ");
           int na = Integer.parseInt(dis.readLine());
           System.out.println("MONEY EARNED:-"+((350*np)-(30*na)));
           System.out.println("PRESS 5 TO CONTINUE");
           i = Integer.parseInt(dis.readLine());
       }
    }
}
