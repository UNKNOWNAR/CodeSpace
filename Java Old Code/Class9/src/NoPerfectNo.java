/*Write a C program to print all Perfect numbers between 1 to n.*/
import java.io.*;
public class NoPerfectNo
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER THE UPPER RANGE");
       int n = Integer.parseInt(dis.readLine());
       int b= 0 ;
       int i;
       int f = 0 ;
       int x = 1;
       while(n>0)
       {
           b=0;
       for( i=1;i<=n-1;i++)
       {
       if(n%i == 0)
       {
              b = b + i;
        }
    }
       if (  b == n)
         {
         System.out.println( n + " is a perfect number");
        }

        n--;
    
}
}
}
                                                                                                     
 
 
   
 