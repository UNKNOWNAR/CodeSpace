/*Write a C program to find all prime factors of a number.*/
import java.io.*;
public class PFactors
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Numbers:- ");
       int n = Integer.parseInt(dis.readLine());
       int pn = 2;
       System.out.println("Prime Factorization of " +n+ " is ");
       while( n!=1)
       {
           pn = (n%pn==0)?pn:pn+1;
           n=n/pn;
           System.out.print((n!=1)?(pn+ " x "):(pn));
        }
    }
}