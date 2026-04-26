/*he Simple Interest (SI) and Compound Interest (CI) of a sum (P) for a given time (T) and rate (R) can be calculated as:

(a) SI = (p * r * t) / 100        (b) CI = P * ((1 + (R / 100))T - 1)

Write a program to input sum, rate, time and type of Interest ('S' for Simple Interest and 'C' for Compound Interest). Calculate and display the sum and the interest earned.*/
import java.io.*;
public class Interest
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Type S to find  of a Simple Interest and  C to find Compound Interst");
       char a = dis.readLine().charAt(0);
       System.out.println("Enter The Principal");
       double P = Double.parseDouble(dis.readLine());
       System.out.println("Enter Rate Of Interest");
       double R = Integer.parseInt(dis.readLine());
       System.out.println("Enter Time");
       int T = Integer.parseInt(dis.readLine());
       double SI=0.0,CI=0.0;
       switch(a)
       {
           case 'S':
           SI = (P*R*T)/100;
           System.out.println("SI on "+P+" this at " +R+" % per annum for " +T+ " years is "+SI);
           break;
           case 'C':
           double Help = 1+(R/100);
           System.out.println(Help);
           CI = P*((Math.pow(Help,T))-1);
           System.out.println("CI on "+P+" this at " +R+" % per annum for " +T+ " years is "+CI);
           break;
           default:
           System.out.println("WRONG INPUT");
       }
       
    }
}
           
      