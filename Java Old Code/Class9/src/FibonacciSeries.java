/*Write a C program to print Fibonacci series up to n terms.0,1,1,2,3,5,8,13,*/
import java.io.*;
public class FibonacciSeries
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Upper Range:-");
       int n = Integer.parseInt(dis.readLine());
       n=n-1;
       System.out.println("0");
       int fbv = 0,fbv1 = 1;
       while(n>0)
       {
           fbv1 = fbv + fbv1;
           fbv = fbv1 - fbv;
           System.out.println(fbv1);
           n--;
        }
    }
}
        
