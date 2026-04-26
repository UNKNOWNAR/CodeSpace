import java.io.*;
public class RowAndColumn
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER HOW MANY ROW YOU WANT TO TAKE INPUT:-");
       int n = Integer.parseInt(dis.readLine());
       System.out.println("ENTER HOW MANY COLUMNS YOU WANT TO TAKE INPUT:-");
       int x = Integer.parseInt(dis.readLine());
       int j = 1;
       int i = 1;
       while(j<=n)
       {
        
        
       while(i<=x)
       {
           System.out.print("*");
           i = i + 1;
        }
        i = i - x;
        System.out.println("*");
        j = j + 1;
    }
}
}