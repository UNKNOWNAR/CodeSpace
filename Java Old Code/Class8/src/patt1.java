import java.io.*;
public class patt1
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER HOW MANY ROW YOU WANT TO TAKE INPUT:-");
       int row = Integer.parseInt(dis.readLine());
       System.out.println("ENTER HOW MANY COLUMNS YOU WANT TO TAKE INPUT:-");
       int col = Integer.parseInt(dis.readLine());
       for(int i=0;i<row;i++) 
       {
           for(int j=0;j<col;j++) {
               System.out.print("*");
            }
            System.out.println();
        }
}
}