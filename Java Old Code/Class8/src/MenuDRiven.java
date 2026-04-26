import java.io.*;
public class MenuDRiven
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        int c=5;
        while(c==5)
        {
        System.out.println("number");
       int a = Integer.parseInt(dis.readLine());
        System.out.println("number");
       int b = Integer.parseInt(dis.readLine());
       System.out.println("number");
       c = Integer.parseInt(dis.readLine());
       if (c == 1)
       {
           int s = a + b ;
           System.out.println(s);
        }
        if (c == 2)
        {
            int d = a - b ;
            System.out.println(d);
        }
        if (c == 3)
        {
            int m = a*b;
            System.out.println(m);
        }
        if (c==4)
        {
            int f = a/b;
            System.out.println(f);
        }
        System.out.println("enter 5 to continue, or 0 to exit");
       c = Integer.parseInt(dis.readLine());
    }
    }
}