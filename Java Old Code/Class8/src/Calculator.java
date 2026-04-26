public class Calculator
{
    public static void main( String args [])
    {
        double a = Double.parseDouble(args [0] );
        double s = a * a; 
        double c = a * a * a;
        System.out.println( "Square of " + a + "is" + s );
        System.out.println( " Cube of " + a + " is " + c );
    }
}