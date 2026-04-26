import java.io.*;
public class Program2
{
    public static void main ( String args [])throws IOException
    { 
      DataInputStream dis = new DataInputStream(System.in);
      System.out.println("HOW MANY NUMBERS YOU WANT TO TAKE INPUT");
      int a = Integer.parseInt(dis.readLine());
      int i = 1;
      int sume = 0, sumo = 0;
      while (i<=a)
      {
       System.out.println("ENTER A NUMBER");
       int b = Integer.parseInt(dis.readLine());  
       if((b%2)==0)
       {
        sume = sume + b;
       }
       else
       {
       sumo = sumo + b;
       }
       i = i + 1;
      }
       System.out.println("Sum of even numbers:-"+sume);
       System.out.println("Sum of odd numbers:-"+sumo);
    }
}