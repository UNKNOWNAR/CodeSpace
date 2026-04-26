import java.io.*;
public class ISOSCALATERAL
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER FIRST SIDE :-");
       int a = Integer.parseInt(dis.readLine());
       System.out.println("ENTER SECOND SIDE:-");
       int b = Integer.parseInt(dis.readLine());
       System.out.println("ENTER THIRD SIDE:-");
       int c = Integer.parseInt(dis.readLine());
       if(a==b && b==c  )
       {
           System.out.println("THE TRIANGLE IS A EQUIOLATERAL  TRIANGLE");
        }
        else if( a==b || b ==c || c==a)
        {
            System.out.println("THE TRIANGLE IS A ISCOCELES TRIANGLE");
        }
        else
        {
            System.out.println("THE TRIANGLE IS A SCALENE TRIANGLE");
        }
    }
}