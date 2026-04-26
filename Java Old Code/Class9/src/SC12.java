/*Write a program in Java to find the sum of the given series :
(a) S = a^2 + a^2 / 2 + a^2 / 3 + ...... + a^2 / 10
(b) S = a + a^2 / 2 + a^3 / 3 + ...... + a^10 / 10
(c) S = (a*2) + (a*3) + ...... + (a*20)
(d) S = a + a^2 + a^3 + ...... + a^n
(e) S = 1 + 2^2 / a + 3^3 / a^2 + ...... to n terms
(f) S = 1^2/a + 3^2 / a^2 + 5^2 / a^3 + ...... to n terms
(g) S = 1/a + 1/a^2 + 1/a^3 + ...... + 1/a^n
(h) S = x/2 + x/5 + x/8 + x/11 + ...... + x/20*/
import java.io.*;
public class SC12
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter a:-");
       int a = Integer.parseInt(dis.readLine());
       System.out.println("Enter n:-");
       int n = Integer.parseInt(dis.readLine());
       System.out.println("Enter x:-");
       int x = Integer.parseInt(dis.readLine());
       double sum = 0;
       double i = 1;
       while(i<=10)
       {
           sum = sum + (Math.pow(a,2)/i);
           i++;
       }
       System.out.println(sum);
       sum = 0;
       i=1;
       while(i<=10)
       {
           sum = sum + (Math.pow(a,i)/i);
           i++;
       }
       System.out.println(sum);
       sum = 0;
       i=2;
       while(i<=20)
       {
           sum = sum + (a*i);
           i++;
       }
       System.out.println(sum);
       sum = 0;
       i=1;
       while(i<=n)
       {
           sum = sum + Math.pow(a,i);
           i++;
       }
       System.out.println(sum);
       sum = 0;
       i=1;
       while(i<=10)
       {
           sum = sum + (Math.pow(a,i)/i);
           i++;
       }
       System.out.println(sum);
       sum = 1;
       i=2;
       while(i<=n)
       {
           sum = sum + (Math.pow(i,i)/(Math.pow(a,i-1)));
           i++;
       }
       System.out.println(sum);
       sum = 0;
       i=1;int j=1;
       while(j<=n)
       {
           sum = sum + (Math.pow(i,2)/(Math.pow(a,j)));
           i=i+2;
           j++;
       }
       System.out.println(sum);
       sum = 0;
       i=1;
       while(i<=n)
       {
           sum = sum + (1/(Math.pow(a,i)));
           i++;
       }
       System.out.println(sum);
       sum = 0;
       i=2;
       while(i<=20)
       {
           sum = sum + x/i;
           i=i+3;
       }
       System.out.println(sum);
    }
}