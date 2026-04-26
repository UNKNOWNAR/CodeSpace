/*Star pattern programs - Write a C program to print the given star patterns.

     n=1
*

 *
***                             n=2
 *

  *
 ***
*****                n=3
 ***
  *
   
  */
  import java.io.*;
public class StarPattern6
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Upper Range:-");
       int n = Integer.parseInt(dis.readLine());
       int x = (2*n)-1;
       int gap = n-1;
       int j = gap;
       int b=1;
       int i=1;
       int a = i;
       int h=1;
       while(x>0)
       {
           System.out.println("");
           while(j>0)
           {
               System.out.print(" ");
               j--;
           }               
           while(i>0)
           {
                System.out.print("*");
                i--;
           }
           i = (h>=n)?a-2:a+2;
           a=i;
           h++;
           x--;
           gap=(b>=n)?gap+1:gap-1;
           b++;
           j=gap;
        }
    }
}