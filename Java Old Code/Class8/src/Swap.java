class Swap
{
    public static void main ( String args [])
    {
        double a = Double.parseDouble(args[0]) ;
        double b = Double.parseDouble(args[1]) ;
        System.out.println("Original number :- " );
       System.out.println("a = " + a );
       System.out.println("b = " + b );
       a = a + b ;
       b = a - b ;
       a = a - b;
       System.out.println("Swapped number :- " );
       System.out.println("a = " + a );
       System.out.println("b = " + b );
    }
}
 