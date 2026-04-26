/*Write a program to input a number. Check and display whether it is a Niven number or not. (A number is said to be Niven which is divisible by the sum of its digits).
Example: Sample Input 126
Sum of its digits = 1 + 2 + 6 = 9 and 126 is divisible by 9.*/
import java.io.*;
public class SC22
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Number:-");
       int n = Integer.parseInt(dis.readLine());
       int sum=0,a=n;
       while(n>0)
       {
           sum += (n%10);
           n =n / 10;
       }
       System.out.println(((a%sum)==0)?a+"is a niven number":a+" is not a niven number");
    }
}
