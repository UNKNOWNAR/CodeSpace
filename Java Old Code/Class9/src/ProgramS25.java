import java.util.Scanner;
public class ProgramS25
{
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          System.out.println("ENTER 1 TO FIND THE EQUIVALENT RESISTANCE OF CONNECTION IN SERIES, 2 TO FIND THE EQUIVALENT RESISTANCE IN PARALLEL ");
          int a  = in.nextInt();
          switch(a)
          {
              case 1:
              System.out.println("ENTER LENGTH OF A CUBOID");
              double r1  = in.nextDouble();
              System.out.println("ENTER BREADTH OF A CUBOID");
              double r2  = in.nextDouble();
              double er = r1+r2;
              System.out.println("EQUIVAKENT RESISTANCE:- "+er);
              break;
              case 2:
              System.out.println("ENTER LENGTH OF A CUBOID");
              r1  = in.nextDouble();
              System.out.println("ENTER BREADTH OF A CUBOID");
              r2  = in.nextDouble();
              er = (r1*r2)/(r1+r2);
              System.out.println("EQUIVAKENT RESISTANCE:- "+er);
              break;
              default:
              System.out.println("INVALID INPUT");
            }
        }
    }