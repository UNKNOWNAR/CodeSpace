/*Write a C program to check whether a number is palindrome or not.*/
import java.io.*;
public class PalindromeNo
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("number");
       int a = Integer.parseInt(dis.readLine());
       int j = 0 ;
      int c =a;
       while( a  > 0)
       {
        int b = a % 10;
      j = j * 10 + b;
       a = a /10;
        
       }
                             
    if ( c == j )
   
    {
        System.out.println( j + " is a Palindrome number " );
    }
    else
    {
        System.out.println( j + " is not a Palindrome number " );
    }
       
    }
}