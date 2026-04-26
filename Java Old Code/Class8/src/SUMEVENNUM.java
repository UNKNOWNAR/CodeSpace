import java.io.*;
public class SUMEVENNUM
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("ENTER A NUMBER:-");
       int a = Integer.parseInt(dis.readLine());
       int i = 0 ;
       int n = 0;
       while (i<=a)
       {
            n = n + i;
            i = i +2;
        }
        System.out.println(" SUM OF EVEN NUM " + n);
    }
}