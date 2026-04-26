/*Write a C program to check whether a number is Armstrong number or not.*/
import java.io.*;
public class Armstrongnumber
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("ENTER A NUMBER");
       int a = Integer.parseInt(dis.readLine());
       int s = 0;
       int r = a ;
       while( a  > 0)
       {
        int b = a % 10;
        s= s + (b*b*b); 
       
       a = a /10;
      }
    if ( s==r)
    {
        System.out.println(r+" IS A ARMSTRONG NUMBER");
    }
    else
    {
        System.out.println(r+" IS NOT A ARMSTRONG NUMBER");
    }
    }
}