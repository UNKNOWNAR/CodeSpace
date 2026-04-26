/*Number pattern programs - Write a C program to print the given number patterns.
4.1
  12
  123
  1234
  12345
  n=5
*/
 import java.io.*;
public class NumberPattern3
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter A Number:-");
       int n = Integer.parseInt(dis.readLine());
       int i=1,h=2;
           while(n>0)
       {
           System.out.println("");
           while(i!=h)
           {
               System.out.print(" "+i);
               i++;
           }
           i=1;
           n--;
           h++;
        }
    }
}
           
           
  