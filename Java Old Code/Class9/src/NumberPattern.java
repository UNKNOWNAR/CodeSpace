/*
1111
2222
3333
4444
n=4
 */
import java.io.*;
public class NumberPattern
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Number of Column:-");
       int nc = Integer.parseInt(dis.readLine());
       int nr = nc;
       int i=1,h=nr;
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
           i++;
        }
    }
}
           
           