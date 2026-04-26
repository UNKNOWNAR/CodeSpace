/*You want to calculate the radius of a circle by using the formula:
Area = (22/7) * r2; where r = radius of a circle
Hence the radius can be calculated as:
r = √((7 * area) / 22)
Write a program in Java to calculate and display the radius of a circle by taking area as an input.*/
import java.io.*;
public class CIRCLE
{
    public static void main ( String args [])throws IOException
    { 
      DataInputStream dis = new DataInputStream(System.in);
      System.out.println("ENTER AREA OF CIRCLE");
      double a = Double.parseDouble(dis.readLine()); 
      double r = Math.sqrt(7 * a / 22);
        System.out.print("Radius of Circle = " + r);
    }
}