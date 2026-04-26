import java.io.*;
public class Program
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER THE FIRST NUMBER IN THE RANGE");
       int a = Integer.parseInt(dis.readLine());
       System.out.println("ENTER THE SECOND NUMBER IN THE RANGE");
       int b = Integer.parseInt(dis.readLine()); 
       System.out.println("ENTER THE NUMBER BY WHICH YOU WANT TO DIVIDE THE NUMBERS IN THE RANGE");
       int c = Integer.parseInt(dis.readLine()); 
       int i = a;
       while (b>=i)
       {
         if((i%c)==0)
         {
           System.out.println(i+" is divisible by "+c);  
         }   
         i=i+1;
        }
    }
}