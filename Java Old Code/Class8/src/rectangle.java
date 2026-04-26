import java.io.*;
public class rectangle
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("LENGTH:-");
       double a = Double.parseDouble(dis.readLine());
       System.out.println("BREADTH:-");
       double b = Double.parseDouble(dis.readLine());
       System.out.println("COST OF FENCING PER UNIT AREA");
       double c = Double.parseDouble(dis.readLine());
       System.out.println("AREA:- "+a*b);
       System.out.println("PERIMETER:- "+2*(a+b));
       System.out.println("COST OF FENCING:- " + 2*(a+b)*c);
    }
}

       