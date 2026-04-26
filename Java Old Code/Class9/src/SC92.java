/*Write a program to accept any 20 numbers and display only those numbers which are prime.
Hint: A number is said to be prime if it is only divisible by 1 and the number itself.*/
import java.io.*;
public class SC92
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       int i = 1 ;
       while(i<=20)
       {
           System.out.println("Enter A Number:-");
           int n = Integer.parseInt(dis.readLine());
           int x = 1,j=0;
           while(n>=x)
           {
                int v = n % x;
                j = (v==0)?j+1:j+0;
                x++;
           }
           if (j==2)
           {
               System.out.println(n+ " is a prime number");
           }  
           i++;
        }
    }
}