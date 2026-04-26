import java.io.*;
public class PosNegZero
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER A NUMBER");
       int a = Integer.parseInt(dis.readLine());
       if(a>0)
       {
           System.out.println(a+" is a positive number");
       }
       else if(a<0)
       {
            System.out.println(a+" is a negative number");
       }
       else
       {
           System.out.println(a+" zero");
       }
    }
}
        