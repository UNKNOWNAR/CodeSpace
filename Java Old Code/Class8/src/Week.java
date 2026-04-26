public class Week
{
    public static void main ( String args [] )
    {
        int a = Integer.parseInt( args [0] ) ;
        if ( a==1 ) 
        {
            System.out.println( " MONDAY " );
        }
        if ( a==2 ) 
        {
            System.out.println( " TUESDAY " );
        }
        if ( a==3 ) 
        {
            System.out.println( " WEDNESDAY " );
        }
        if ( a==4 ) 
        {
            System.out.println( " THRUSDAY " );
        }
        if ( a==5 ) 
        {
            System.out.println( " FRIDAY " );
        }
        if ( a==6 ) 
        {
            System.out.println( " SATURDAY " );
        }
        if ( a==7 ) 
        {
            System.out.println( " SUNDAY " );
        }
        if ((a>7)||(a<1))
        {
            System.out.println( " INVALID NUMBER " );
        }
    }
}
        
   