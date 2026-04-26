/*Write a program to calculate the sum of all odd numbers and even numbers between a range of numbers from m to n (both inclusive) where m < n. Input m and n (where m<n).*/
import java.io.*;
public class SC3
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter The Lower Range:-");
       int n = Integer.parseInt(dis.readLine());
       System.out.println("Enter The Upper Range:-");
       int m = Integer.parseInt(dis.readLine());
       int cp = 0, sumo = 0, sume = 0;
       for(int i = n;i<=m;i++)
       {
           sumo = (i%2!=0)?sumo + i:sumo+0;
           sume = (i%2==0)?sume+i:sume+0;
        }
       System.out.println("Sum of even numbers:- "+sume);
       System.out.println("Sum of odd numbers:- "+sumo);
    }
}
