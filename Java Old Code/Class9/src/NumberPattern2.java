/*Number pattern programs - Write a C program to print the given number patterns.
3.1
  22
  333
  4444
  55555
  n=5*/
  import java.io.*;
public class NumberPattern2
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter A Number:-");
       int n = Integer.parseInt(dis.readLine());
       int i=1,h=0;
           while(n>0)
       {
           System.out.println("");
           while(i!=h)
           {
               System.out.print(" "+i);
               h++;
           }
           i++;
           n--;
           h=0;
        }
    }
}
           
           
  