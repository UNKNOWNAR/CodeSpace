/*Star pattern programs - Write a C program to print the given star patterns.

2.*
  **
  ***                           n=4
  ****
  */
 import java.io.*;
public class StarPattern2
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Upper Range:-");
       int nc = Integer.parseInt(dis.readLine());
       int nr=1,i=1;
       while(nc>=nr)
       {
           System.out.println("");
           while(i<=nr)
           {
               System.out.print(" *");
               i++;
           }
           i=1;
           nr++;
        }
    }
}