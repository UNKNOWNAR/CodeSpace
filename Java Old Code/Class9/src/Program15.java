import java.util.Scanner;
public class Program15
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER 1 TO FIND THE VOLUME OF A CUBOID, 2 TO FIND THE VOLUME OF A CYLINDER AND 3 TO FIND THE VOLUME OF A CONE");
          int a  = in.nextInt();
          double pi = 22/7;
          switch(a)
          {
              case 1:
              System.out.println("ENTER LENGTH OF A CUBOID");
              double l  = in.nextDouble();
              System.out.println("ENTER BREADTH OF A CUBOID");
              double b  = in.nextDouble();
              System.out.println("ENTER HEIGHT OF A CUBOID");
              double h  = in.nextDouble();
              double v = l*b*h;
              System.out.println("VOLUME:- "+v);
              break;
              case 2:
              System.out.println("ENTER RADIUS OF A CYLINDER");
              double r  = in.nextDouble();
              System.out.println("ENTER HEIGHT OF A CYLINDER");
              double h1  = in.nextDouble();
              double vc = 22*r*r*h1/7;
              System.out.println("VOLUME:- "+vc);
              break;
              case 3:
              System.out.println("ENTER RADIUS OF A CONE");
              double r1  = in.nextDouble();
              System.out.println("ENTER HEIGHT OF A CONE");
              double h2  = in.nextDouble();
              double vco = 22*r1*r1*h2/21;
              System.out.println("VOLUME:- "+vco);
              break;
              default:
              System.out.println("INVALID INPUT");
            }
        }
    }