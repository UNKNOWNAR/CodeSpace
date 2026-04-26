import java.io.*;
public class Program3
{
    public static void main ( String args [])throws IOException
    { 
      DataInputStream dis = new DataInputStream(System.in);
      System.out.println("ENTER A POSITIVE NUMBER");
      int a = Integer.parseInt(dis.readLine());
      int i = 1;
      if(a>0)
      {
       while(i<=10)
       {
         System.out.println(a + " x " + i + " = " + (a*i));
         i = i +1; 
       }
    }
       else
       {
           System.out.println("Please input a positive number");
        }
    }
    }
