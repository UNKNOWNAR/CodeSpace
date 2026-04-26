/*Write a program to compute and display the sum of the following series:
S = (1 + 2) / (1 * 2) + (1 + 2 + 3) / (1 * 2 * 3) + -------- + (1 + 2 + 3 + ----- + n ) / (1 * 2 * 3 * ----- * n)*/
import java.io.*;
public class SC93
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter A Number:-");
       int n = Integer.parseInt(dis.readLine());
       int i = 1,j=2;
       double sum=0;
       while(j<=n+1)
       {
           int sum1 = 0,x=1,v=1,product = 1;
           while(x<=i)
           {
               product *= x;
               x++;
           }
           while(v<=j)
           {
               sum1 += v;
               v++;
           }
           sum = sum + (sum1/product);
           i++;
           j++;
       }
       System.out.println("SUM :- "+sum);
    }
}
        