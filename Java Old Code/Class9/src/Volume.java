/*The volume of solids, viz. cuboid, cylinder and cone can be calculated by the formula:

Volume of a cuboid (v = l*b*h)
Volume of a cylinder (v = π*r2*h)
Volume of a cone (v = (1/3)*π*r2*h)
Using a switch case statement, write a program to find the volume of different solids by taking suitable variables and data types.*/
 import java.io.*;
public class Volume
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Type 1 to find volume of a cuboid, Type 2 to find volume of cylinder and Type 3 to find volume of a cone");
       int a = Integer.parseInt(dis.readLine()); 
       switch(a)
       {
           case 1:
           System.out.println("Enter Length of Cuboid");
           double l = Double.parseDouble(dis.readLine());
           System.out.println("Enter Breadth of Cuboid");
           double b = Double.parseDouble(dis.readLine());
           System.out.println("Enter Height of Cuboid");
           double h = Double.parseDouble(dis.readLine());
           System.out.println("VOLUME OF CUBOID:-"+(l*b*h));
           break;
           case 2:
           System.out.println("Enter Radius of Cylinder");
           double r = Double.parseDouble(dis.readLine());
           System.out.println("Enter  of Cuboid:-");
           double hcl = Double.parseDouble(dis.readLine());
           System.out.println("VOLUME OF CUBOID"+((r*r*hcl*22)/7));
           break;
           case 3:
           System.out.println("Enter Radius of Cone");
           double rc = Double.parseDouble(dis.readLine());
           System.out.println("Enter  of Cone");
           double hc = Double.parseDouble(dis.readLine());
           System.out.println("VOLUME OF Cone:-"+((rc*rc*hc*22)/21));
           break;
           default:
           System.out.println("WRONG INPUT");
        }
    }
}