/*Write a program to display all the 'Buzz Numbers' between p and q (where p<q). A 'Buzz Number' is the number which ends with 7 or is divisible by 7.*/
import java.io.*;
public class SC6
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter The Lower Range:-");
       int q = Integer.parseInt(dis.readLine());
       System.out.println("Enter The Upper Range:-");
       int p = Integer.parseInt(dis.readLine());
       for(int i =q;i<=p;i++)
       {
           if(i%7==0||i%10==7)
           {
               System.out.println(i+" is a buzz no");
           }
        }
    }
}