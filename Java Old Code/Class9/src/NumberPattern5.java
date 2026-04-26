/*Number pattern programs - Write a C program to print the given number patterns.
2.1111
  2222
  4444
  5555
  6666
row = 6, col = 4*/
import java.io.*;
public class NumberPattern5
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Number of Column:-");
       int nc = Integer.parseInt(dis.readLine());
       System.out.println("Enter Number of Row:-");
       int nr = Integer.parseInt(dis.readLine());
       int i=1,h=nc;
           while(nr>0)
       {
           System.out.println("");
           while(nc>0)
           {
               System.out.print(" "+i);
               nc--;
           }
           nr--;
           nc=h;
           i++;
        }
    }
}       
           
