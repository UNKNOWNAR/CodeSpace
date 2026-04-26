;import java.io.*;
public class NUMCHANGE
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("number");
       int a = Integer.parseInt(dis.readLine());
       int j = 0 ;
       int b = a % 10;
       int c = a - (b*10);
       int d = 0;
       int h = 0;
      while(a >= 9)
      {
        h = a % 10;
        d = d+1;
       }
    while( a  > 0)
       {
        int e = a % 10;
      
       a = a /10;
       j = j * 10 + e; 
    }
     double f = Math.pow(10,(double)d);
     double g = c * f + h;
     double i = j - f;
     System.out.println(i);
    }
}