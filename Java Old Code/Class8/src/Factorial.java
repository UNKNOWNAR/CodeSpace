import java.io.*;
public class Factorial
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("number");
       int a = Integer.parseInt(dis.readLine());
       int b= 1;
       int i = 1;
       while (i <= a)
       {
        b = b* i;
        i = i + 1;
         }
       System.out.println(b);
    }
}