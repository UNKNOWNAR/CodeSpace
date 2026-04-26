/*Write a C program to find power of a number using for loop.
Write a C program to find all prime factors of a number.*/
import java.io.*;
public class PowerLoop
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Number:-");
       int n = Integer.parseInt(dis.readLine());
       int a = n;
       System.out.println("Enter The index:-");
       int in = Integer.parseInt(dis.readLine());
       int i = 0;
       while(n!=0)
       {
           n=n/in;
           i++;
       }
       System.out.println(in+" to the power "+(i-1)+ " is "+a);
        }
    }
