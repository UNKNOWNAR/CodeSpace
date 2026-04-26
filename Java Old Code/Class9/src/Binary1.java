/*Write a C program to find one's complement of a binary number.*/
import java.io.*;
public class Binary1
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Value in Binary");
       int b = Integer.parseInt(dis.readLine());
       String b1="";
       String n="";
       int m=b;
       while(b>0)
       {
           int r = b % 10;
           n =(r==0)?"1":"0";
           b1 = n + b1;
           b=b/10;
       }
       System.out.println("One Complement's of "+m+" is " +b1); 
    }
}