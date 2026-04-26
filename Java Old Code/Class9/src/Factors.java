/*Write a C program to find all factors of a number.*/
import java.io.*;
public class Factors
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Number:-");
       int n = Integer.parseInt(dis.readLine());
       int i = 1;
       while(n>=i)
       {
           int x = n%i;
           if(x==0)
           {
               System.out.println(i);
           }
           i++;
       }
    }
}