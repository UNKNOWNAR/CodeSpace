/*Write a C program to print all Armstrong numbers between 1 to n.*/
import java.io.*;
public class NoofArmstrongNo
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER THE UPPER LIMIT:-");
       int n = Integer.parseInt(dis.readLine());
       for(int e=0;e<=n;e++) 
       {
          int i = e ;
          int s = 0 ;
          while(i>0)
          {
             int b = i % 10;
             s= s + (b*b*b); 
             i = i/10;
           }
          if (s==e)
          {
            System.out.println(e+" IS A ARMSTRONG NUMBER");
          }
        }
    }
}