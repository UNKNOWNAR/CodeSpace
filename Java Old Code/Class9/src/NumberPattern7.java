/*Number pattern programs - Write a C program to print the given number patterns.
4.12345
  1234
  123
  12
  1
  n=5
*/
 import java.io.*;
public class NumberPattern7
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
           while(i!=n+1)
           {
               System.out.print(" "+i);
               i++;
           }
           i=1;
           n--;
        }
    }
}
           
           
  
