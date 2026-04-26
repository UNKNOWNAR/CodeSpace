class Average
{
    public static void main ( String args[])
    {
        String n = ( args[0] );
        String c = ( args[1] );
        String r = ( args[2] );
        int Mm = Integer.parseInt( args[3] );
        int Me = Integer.parseInt( args[4] );
        int Mc = Integer.parseInt( args[5] );
        int Mg = Integer.parseInt( args[6] );
        int Mb = Integer.parseInt( args[7] );
        int s = Mm + Me + Mg + Mb + Mc;
        int a = s/5;
        System.out.println("NAME:-"+n);
        System.out.println("CLASS:-"+c);
        System.out.println("Roll:-"+r);
        System.out.println("AVARAGE:-"+a);
    }
}