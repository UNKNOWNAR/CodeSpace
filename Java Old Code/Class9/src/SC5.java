/*Write a program to display all the numbers between m and n input from the keyboard (where m<n, m>0, n>0), check and print the numbers that are perfect square. e.g. 25, 36, 49, are said to be perfect square numbers.*/
import java.io.*;
public class SC5
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter The Lower Range:-");
       int n = Integer.parseInt(dis.readLine());
       System.out.println("Enter The Upper Range:-");
       int m = Integer.parseInt(dis.readLine());
       double sqrt = 0.0, rd = 0;
       for(double i = n;i<=m;i++)
       {
           sqrt = Math.sqrt(i);
           rd = Math.round(sqrt);
           if((rd-sqrt)==0)
           {
               System.out.println(i+" is a Perfect Square");
           }
        }
    }
}
