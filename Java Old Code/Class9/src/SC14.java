/*Write a program to input Principal (p), Rate (r) and Time (t). Calculate and display the amount, which is compounded annually for each year by using the formula:
Simple Interest (si) = (prt) / 100
                            p = p + si*/
import java.io.*;
public class SC14
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Principal:-");
       double p = Double.parseDouble(dis.readLine());
       System.out.println("Enter Rate Of Interest:-");
       double r= Double.parseDouble(dis.readLine());
       System.out.println("Enter Time:-");
       int t = Integer.parseInt(dis.readLine());
       double si = 1;
       int i=1;
       while(t>0)
       {
           si = ((p*r*1)/100);
           p += si;
           System.out.println("Amount after "+i+" year:- "+p);
           t--;
           i++;
       }
       }       
}