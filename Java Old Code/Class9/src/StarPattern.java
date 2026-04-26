/*Star pattern programs - Write a C program to print the given star patterns.
1.***
  ***                    n=3
  *** */
import java.io.*;
public class StarPattern
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Upper Range:-");
       int nc = Integer.parseInt(dis.readLine());
       int nr=nc,h=nr;
       while(nc>0)
       {
           System.out.println("");
           while(nr>0)
           {
               System.out.print(" *");
               nr--;
           }
           nc--;
           nr=h;
        }
    }
}