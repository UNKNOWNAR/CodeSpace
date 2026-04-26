class Second
{
    public static void main ( String args[])
    {
        double s = Double.parseDouble ( args [0]);
        double t = Double.parseDouble ( args [1]);
        if  ( t >= 5 )
        {
            double d = (s*5)/(100);
            double ts = s + d ;
            System.out.println("You got 5% bonus. Your total salary is " + ts + " and bonus is " + d ); 
       
    }
    else 
    { 
       System.out.println(" Your Working period is not  5 years or more than 5 years so you get no bonus and your salary is " + s);
}
}
}    
    