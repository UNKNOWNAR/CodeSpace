/*Write a C program to find HCF (GCD) of two numbers.*/
import java.io.*;
public class GCD
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Number:-");
       int n = Integer.parseInt(dis.readLine());
       System.out.println("Enter the Number:-");
       int n1 = Integer.parseInt(dis.readLine());
       int g = (n>n1)?n:n1;
       int s =(n>n1)?n1:n;
       int r=1;
       while(r!=0)
         {
          r = g%s;
          g=s;
          s=r;
         }
       System.out.println("GREATEST COMMON DIVIDOR:- "+g);
          }
}