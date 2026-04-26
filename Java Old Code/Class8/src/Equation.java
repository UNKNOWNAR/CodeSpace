public class Equation
{
    public static void main ( String args [])
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = b*b-4*a*c;
        d = Math.sqrt(d);
        double e = (-b + d ) / ( 2 * a  );
        double f = (-b - d ) / ( 2 * a  );
        System.out.println( " Value of x are " + e + " and " + f );
    }
}
