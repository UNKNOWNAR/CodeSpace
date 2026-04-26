import java.io.*;
public class Circle
{
    public static void main ( String args [])throws IOException
    { 
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter the value of the radius");
       double r = Double.parseDouble(dis.readLine());
       
       double area = (22/7.0)*r*r;
       double perimeter = 2*(22/7.0)*r;
       System.out.println("Area of a circle whose radius is" + r + "is" + area);
       System.out.println("Perimeter of a circle whose radius is" + r + "is" + perimeter);
    }
}