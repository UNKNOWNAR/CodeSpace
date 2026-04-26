/*Write a C program to print all Prime numbers between 1 to n.
   Write a C program to find sum of all prime numbers between 1 to n.*/
import java.io.*;
public class NoofPrimeNo
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER THE UPPER LIMIT:-");
       int n = Integer.parseInt(dis.readLine());
       int y=0;
       for(int a = 1;a<=n;a++)
       {
       int i =1,j=0;
       while(a>=i)
       {
           int x = a % i;
           j = (x==0)?j+1:j+0;
           i++;
       }
       if(j==2)
       {
           System.out.println(a+" is a prime number");
           y=y+a;
       }
    }
    System.out.println("Sum of  Prime Numbers "+y);
}
}
