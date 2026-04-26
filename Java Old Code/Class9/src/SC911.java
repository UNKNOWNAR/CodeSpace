/*Write a program to input a three digit number. Display its digits raised to the power of their respective position.
 Sample Input: 465
 Sample Output: 5^1=5
                6^2=36
                4^3=64
 */
import java.io.*;
public class SC911
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER A NUMBER");
       int a = Integer.parseInt(dis.readLine());
       int i = 1,n=0;
       while(a>0)
       {
           n = a % 10;
           double pow = Math.pow(n,i);
           System.out.println(n+"^"+i+" = "+pow);
           a = a/10;
           i++;
           }
           }
        }
        