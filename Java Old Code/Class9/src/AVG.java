/*In an examination, you have appeared for three subjects i.e. Physics, Chemistry and Biology. Write a program in Java to calculate the average mark obtained and finally display the marks in rounded-off form.
Take Physics, Chemistry. and Biology marks as inputs.*/
import java.io.*;
public class AVG
{
    public static void main ( String args [])throws IOException
    { 
      DataInputStream dis = new DataInputStream(System.in);
      System.out.println("ENTER MARKS IN PHYSICS");
      double a = Double.parseDouble(dis.readLine()); 
      System.out.println("ENTER MARKS IN CHEMISTRY");
      double b = Double.parseDouble(dis.readLine()); 
      System.out.println("ENTER MARKS IN BIOLOGY");
      double c = Double.parseDouble(dis.readLine()); 
      double avg = (a + b + c) / 3.0;
      long roundAvg = Math.round(avg);
      
        System.out.println("Rounded Off Avg Marks = " + roundAvg);
    }
}
   