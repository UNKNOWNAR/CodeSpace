class Mileage
{
    public static void main ( String args[])
    {
        double m = Double.parseDouble(args[0]);
        double tp = Double.parseDouble(args[1]);
        double cpl = Double.parseDouble(args[2]);
        double td = m * tp;
        double tc = tp * cpl;
        System.out.println ("Total distance :- " + td);
        System.out.println ("Total cost:- " + tc );
    }
}
        
        