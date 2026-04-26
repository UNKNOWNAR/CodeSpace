/*Write a C program to find LCM of two numbers.*/
import java.io.*;
public class LCM
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Number:-");
       int n = Integer.parseInt(dis.readLine());
       System.out.println("Enter the Number:-");
       int n1 = Integer.parseInt(dis.readLine());
       int x=0;
       int i = (n>n1)?n:n1;
       while(x==0)
       {
           int f1 = i % n;
           int f2 = i % n1;
           if(f1==0&&f2==0)
           {
               x=x+i;
            }
            i++;
        }
        System.out.println("LOWEST COMMON MULTIPLE IS:- "+x);
    }
}
           
       