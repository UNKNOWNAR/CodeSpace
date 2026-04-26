/*Write a program to enter any 50 numbers and check whether they are divisible by 5 or not. If divisible then perform the following tasks:
(a) Display all the numbers ending with the digit 5.
(b) Count those numbers ending with 0 (zero)*/
import java.io.*;
public class SC4
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       int cp = 0, sump = 0, sumn = 0;
       for(int i = 0;i<50;i++)
       {
           System.out.println("Enter a Number:-");
           int n = Integer.parseInt(dis.readLine());
           if(n%5==0)
           {
           if((n%10)==5)
           {
               System.out.println("Number's Ending with 5"+n);
           }
           sumn = (n%10==0)?sumn+1:sumn+0;
           }
        }
       System.out.println("NUMBER OF NUMBERS ENDING WITH 0:- "+sumn);
    }
}
