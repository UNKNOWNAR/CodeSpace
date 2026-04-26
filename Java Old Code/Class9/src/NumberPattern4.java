/*
4444
3333
2222
1111
n=4
 */
import java.io.*;
public class NumberPattern4
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Number of Column:-");
       int nc = Integer.parseInt(dis.readLine());
       int nr = nc;
       int i=nc,h=nr;
           while(nc>0)
       {
           System.out.println("");
           while(nr>0)
           {
               System.out.print(" "+i);
               nr--;
           }
           nc--;
           nr=h;
           i--;
        }
    }
}
           
           