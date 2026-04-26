/*A special two-digit number is such that when the sum of its digits is added to the product of its digits, the result is equal to the original two-digit number.
Example: Consider the number 59.
               Sum of digits = 5 + 9 = 14
               Product of digits = 5 * 9 = 45
               Sum of the sum of digits and product of digits = 14 + 45 = 59
Write a program to accept a two-digit number. Add the sum of its digits to the product of its digits. If the value is equal to the number input, then display the message "Special 2 - digit number" otherwise, display the message "Not a special two-digit number".*/
import java.io.*;
public class SC20
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER A NUMBER");
       int n = Integer.parseInt(dis.readLine());
       int sum=0,product = 1,a=n;
       while(n>0)
       {
           sum = sum + (n%10);
           product *= (n%10);
           n= n /10;
        }
       System.out.println((a==(sum+product))?a+" is a special number":a+" is not a special number");
       
    }
}