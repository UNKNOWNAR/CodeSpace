/*Number pattern programs - Write a C program to print the given number patterns.
2.6666
  5555
  4444
  3333
  2222
  1111
  row = 6, col = 4*/
import java.io.*;
public class NumberPattern1
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Number of Column:-");
       int nc = Integer.parseInt(dis.readLine());
       System.out.println("Enter Number of Row:-");
       int nr = Integer.parseInt(dis.readLine());
       int i=nr,h=nr;
           while(nc>0)
       {
           System.out.println("");
           while(nr>0)
           {
               System.out.print(" "+i);
               nr--;
           }
           nc--;
           nr=h;
           i--;
        }
    }
}
           
           

           
           