import java.io.*;
public class Program4
{
   public static void main ( String args [])throws IOException
   { 
      DataInputStream dis = new DataInputStream(System.in);
      int c = 1;
      int b = 0;
      while(c!=0)
      {
      System.out.println("ENTER A NUMBER");
      int a = Integer.parseInt(dis.readLine());
      b = b + a; 
      c = a;
     }
     System.out.println("The sum is " + b);
   }
}