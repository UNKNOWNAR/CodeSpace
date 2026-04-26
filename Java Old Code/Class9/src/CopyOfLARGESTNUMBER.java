import java.io.*;
public class CopyOfLARGESTNUMBER
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       
       System.out.println("ENTER A NUMBER");
       int a = Integer.parseInt(dis.readLine());
        System.out.println("ENTER A NUMBER");
       int c = Integer.parseInt(dis.readLine()); 
       System.out.println("ENTER A NUMBER");
       int b = Integer.parseInt(dis.readLine()); 
       int d = (a>c&&a>b)?a:0;
      int e = (b>c&&b>a)?b:0;
      int f = (c>a&&c>b)?c:0;
      int max = d+e+f;
       System.out.println("THE LARGEST NUMBER IS :-"+max);
    }
        
}

        
   
