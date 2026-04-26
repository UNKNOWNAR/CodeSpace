/*The Greatest Common Divisor (GCD) of two integers is calculated by the continued division method. Divide the larger number by the smaller, the remainder then divides the previous divisor. The process repeats unless the remainder reaches to zero. The last divisor results in GCD.
Sample Input: 45, 20
Sample Output: GCD=5*/
import java.io.*;
public class SC11
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