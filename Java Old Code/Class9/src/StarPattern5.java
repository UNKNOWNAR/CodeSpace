/*Star pattern programs - Write a C program to print the given star patterns.

2.    *
     **                       n=4
    ***
   ****
  */
 import java.io.*;
public class StarPattern5
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Upper Range:-");
       int nc = Integer.parseInt(dis.readLine());
       int x = 0,i=0;
       int nr=nc;
       while(nr>0)
       {
           System.out.println("");
           while(i>0)
           {
                System.out.print(" ");
                i--;
           }
              while(nr>0)
           {
               System.out.print("*");
               nr--;
           }
           x++;
           i=x;
           nc--;
           nr = nc;
        }
    }
}