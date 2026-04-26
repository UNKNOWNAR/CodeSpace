/*The equivalent resistance of series and parallel connections of two resistances are given by the formula:

(a) R1 = r1 + r2 (Series)
(b) R2 = (r1 * r2) / (r1 + r2) (Parallel)

Using a switch case statement, write a program to enter the value of r1 and r2. Calculate and display the equivalent resistances accordingly.*/
import java.io.*;
public class Resistance
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Type 1 to calculate Resisatnce of parallel and Type 2 to convert calculate Resisatnce of series ");
       int a = Integer.parseInt(dis.readLine());
       System.out.println("ENTER VALUE OF FIRST RESISTANCE");
       int r1 = Integer.parseInt(dis.readLine());
       System.out.println("ENTER VALUE OF SECOND RESISTANCE");
       int r2 = Integer.parseInt(dis.readLine());
       int R =0;
       switch(a)
       {
           case 1: 
           R = (r1*r2)/(r1+r2);
           break;
           case 2:
           R = r1 + r2;
           break;
           default: 
           System.out.println("WRONG INPUT");
       }
       System.out.println("RESISTANCE:-"+R);
    }
}
