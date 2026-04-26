/*Number pattern programs - Write a C program to print the given number patterns.
3.55555
  4444
  333
  22
  1
  n=5*/
  import java.io.*;
public class NumberPattern6
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter A Number:-");
       int n = Integer.parseInt(dis.readLine());
       int i=n,h=n;
           while(n>0)
       {
           System.out.println("");
           while(h>0)
           {
               System.out.print(" "+i);
               h--;
           }
           i--;
           n--;
           h=n;
        }
    }
}
           
           
  
