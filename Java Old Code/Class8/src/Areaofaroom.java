public class Areaofaroom
{
    public static void main ( String args [] )
    {
        double l = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double h = Double.parseDouble(args[2]);
        double sar = 2 * ((l*b)+(l*h)+(b*h));
        double aw = 2 * ((l*h)+(b*h));
        double cost = aw * 40;
        System.out.println( " Surface area of a room " +sar);
        System.out.println( " Area of walls " + aw );
        System.out.println( " Cost of painting " + cost );
    }
}