/*Write a C program to check whether a number is Perfect number or not.*/
import java.io.*;
public class PERFECTNO
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("ENTER A NUMBER");
       int a = Integer.parseInt(dis.readLine());
       int b= 0 ;
       int i;
       int f = 0 ;
       for( i=1;i<=a-1;i++)
        if(a%i == 0)
          {
              b = b + i;
            }
       if (  b == a)
         {
         System.out.println( a + " is a perfect number");
        }
         else
         {
           System.out.println( a + " is not a perfect number");
        }
}
}                                                                                                     
 
 
   