import java.io.*;
public class Bin
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Value in Binary");
       int b = Integer.parseInt(dis.readLine());
       int d=0;
       double i=0;
       while(b>0)
       {
           int dig = b % 10;
           d = d + (int)(Math.pow(2,i)*dig);
           i++;
           b = b /10;
        }
        System.out.println(d);
       }
    }
    