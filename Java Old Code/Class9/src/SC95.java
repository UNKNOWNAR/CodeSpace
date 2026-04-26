/*Write a program to calculate and display the factorials of all the numbers between 'm' and 'n' (where m<n, m>0, n>0).
[Hint: factorial of 5 means: 5!=5*4*3*2*1]*/
import java.io.*;
public class SC95
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER LOWER RANGE:- ");
       int m = Integer.parseInt(dis.readLine());
       System.out.println("ENTER UPPER RANGE:- ");
       int n = Integer.parseInt(dis.readLine());
       while(m!=n+1)
       {
           int a = m ;  
           int b= 1;
           System.out.print("Factorial of "+a  );     
            while (a>0)
           {
            b = b* a;
            a--;
           }
            System.out.print(" is "+b);
            m++;
            System.out.println("");
       }
       
    }
}