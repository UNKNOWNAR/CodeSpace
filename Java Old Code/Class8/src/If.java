public class If
{
    public static void main ( String args [] )
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        if ((a>b) && (a>c))
        {
            System.out.println( a + " is the greater number " );
        }
        
        if ((b>a) && (b>c))
        {
            System.out.println( b + " is the greater number " );
        }
        if ((c>b) && (c>a))
        {
            System.out.println( c + " is the greater number " );
        }
        
        
    }
}