/*Write a program in Java to calculate and display the hypotenuse of a Right-Angled Triangle by taking perpendicular and base as inputs.
HDouble: h = √p2 + b2*/
import java.io.*;
public class Hypotenuse
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER LENGTH OF PERPENDICULAR");
       double p = Double.parseDouble(dis.readLine()); 
       System.out.println("ENTER LENGTH OF BASE");
       double b = Double.parseDouble(dis.readLine()); 
       double h = Math.sqrt(Math.pow(p,2)+Math.pow(b,2));
       System.out.println("Hypotenuse :- "+h);
    }
}
