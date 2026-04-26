import java.io.*;
public class SAYNOTOFORLOOP
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER VALUE OF n");
       int n = Integer.parseInt(dis.readLine());
       int s = 0;
       int i = 2;
       while(i<=2*n)
       {
          s = s + i*i;
          i = i + 2;
        }
 System.out.println("SUM:-"+s);
}
}