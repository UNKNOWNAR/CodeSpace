import java.io.*;
public class Sumofevennumbers
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER VALUE OF n");
       int n = Integer.parseInt(dis.readLine());
       int s = 0;
       ;
       for(int i = 2;i<=2*n; i = i + 2)
       {
          s = s + i*i;
         
        }
 System.out.println("SUM:-"+s);
}
}