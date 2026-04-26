import java.io.*;
public class SQURAE2
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER LENGTH");
       int l = Integer.parseInt(dis.readLine());
       System.out.println("ENTER BREADTH");
       int b = Integer.parseInt(dis.readLine());
       if(l==b)
       {
           System.out.println("IT IS A SQUARE");
        }
        else
        {
            System.out.println("IT IS NOT A SQUARE");
        }
    }
}