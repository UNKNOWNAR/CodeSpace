/*Write a program to input any 50 numbers (including positive and negative).
Perform the following tasks:
(a) Count the positive numbers
(b) Count the negative numbers
(c) Sum of positive numbers
(d) Sum of negative numbers*/
import java.io.*;
public class SC2
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       int cp = 0, sump = 0, sumn = 0;
       for(int i = 1;i<=50;i++)
       {
           System.out.println("Enter Number:-");
           int n = Integer.parseInt(dis.readLine());
           cp = (n>=0)?cp+1:cp+0;
           sump = (n>0)?sump + n:sump+0;
           sumn = (n<0)?sumn+n:sumn+0;
        }
       System.out.println("NO OF POSITIVE NUMBERS:- "+cp);
       System.out.println("NO OF POSITIVE NUMBERS:- "+(50-cp));
       System.out.println("Sum of positive numbers:- "+sump);
       System.out.println("Sum of negative numbers:- "+sumn);
    }
}
