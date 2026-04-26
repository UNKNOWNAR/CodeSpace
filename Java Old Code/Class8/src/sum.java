import java.io.*;
public class sum
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("number");
       int a = Integer.parseInt(dis.readLine());
       int s = 0;
       int r = a ;
       while( a  > 0)
       {
        int b = a % 10;
        s= s + b ; 
       
       a = a /10;
    }
    System.out.println( " THE SUM OF DIGITS " + r + " IS " + s);
       
    }
}