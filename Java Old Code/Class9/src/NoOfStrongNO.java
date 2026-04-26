/*Write a C program to print all Strong numbers between 1 to n.*/
import java.io.*;
public class NoOfStrongNO
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Upper Range:-");
       int n = Integer.parseInt(dis.readLine());
       int m = n,de = 0,fac = 1,sum = 0;
       while(n>0)
       {
           while(m>0)
           {
               de = m % 10;
               while (de>0)
               {
                    fac = fac * de;
                    de--;
               }               
               sum = sum + fac;
               fac=1;
               m = m / 10;
            }
           if(sum==n)
           {
                System.out.println(n+ " is a Strong Number");
           }
           n--;
           m=n;sum=0;
        }
    }
    }