import java.io.*;
public class Factor
{
    public static void main ( String args [])throws IOException
    { 
      DataInputStream dis = new DataInputStream(System.in);
      System.out.println("ENTER A NUMBER");
      int a = Integer.parseInt(dis.readLine());
      int i = 1;
      while(i<=a)
      {
         if((a%i)==0)
         {
           System.out.println(i + "is a factor of " +a);  
        }
        i = i +1;
    }
}
}