import java.io.*;
public class ANGLES
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER FIRST ANGLE:-");
       int a = Integer.parseInt(dis.readLine());
       System.out.println("ENTER SECOND ANGLE:-");
       int b = Integer.parseInt(dis.readLine());
       System.out.println("ENTER THIRD ANGLE:-");
       int c = Integer.parseInt(dis.readLine());
       if((a+b+c) == 180  )
       {
           System.out.println("TRIANGLES ARE VALID");
        }
        else
        {
            System.out.println("TRIANGLES ARE NOT VALID");
        }
    }
}