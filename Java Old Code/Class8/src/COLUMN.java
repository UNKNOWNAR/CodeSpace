import java.io.*;
public class COLUMN
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER HOW MANY COLUMNS YOU WAN TO TAKE INPUT:-");
       int n = Integer.parseInt(dis.readLine());
       int i = 1;
       while(i<=n)
       {
           System.out.print("*");
           i = i + 1 ;
        }
    }
}