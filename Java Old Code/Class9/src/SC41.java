import java.io.*;
public class SC41
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter The Value of x:-");
       double x = Double.parseDouble(dis.readLine());
       System.out.println("Enter The Value of a,b,c:-");
       double a = Double.parseDouble(dis.readLine());
       double b = Double.parseDouble(dis.readLine());
       double c = Double.parseDouble(dis.readLine());
       double a1 = (double)(((x+3)/6)-((2*x+5)/3));
       double b1 = (double)(((a*a)+(b*b)+(c*c))/(a*b*c));
       System.out.println(a1);
       System.out.println(b1);
    }
}