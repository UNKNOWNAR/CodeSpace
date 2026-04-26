/*Write a C program to check whether a number is Prime number or not.*/
import java.io.*;
public class PrimeNO
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Number:-");
       int n = Integer.parseInt(dis.readLine());
       int i= 1,x=0,j=0;
       while(n>=i)
       {
           x = n % i;
           j = (x==0)?j+1:j+0;
           i++;
       }
       System.out.println((j>2)?n+" is not a prime number":n+" is a prime number" );
    }
}