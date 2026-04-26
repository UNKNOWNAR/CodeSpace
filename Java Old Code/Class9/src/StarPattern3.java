/*Star pattern programs - Write a C program to print the given star patterns.

2.****
  ***
  **                           n=4
  *
  */
 import java.io.*;
public class StarPattern3
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Upper Range:-");
       int nc = Integer.parseInt(dis.readLine());
       System.out.println("Enter a character");
       char a = dis.readLine().charAt(0);
       int nr=nc;
       while(nc>0)
       {
           System.out.println("");
           while(nr>0)
           {
               System.out.print(" "+ a);
               nr--;
           }
           nc--;
           nr=nc;
        }
    }
}