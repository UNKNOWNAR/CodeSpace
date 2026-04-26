class First
{
    public static void main (String args [])
{
    double a = Double.parseDouble(args [0]);
    double b = Double.parseDouble(args [1]);
    double c = Double.parseDouble(args [2]);
    double d = Double.parseDouble(args [3]);
    double e = Double.parseDouble(args [4]);
    double av = (a+b+c+d+e)/(5 );
    if (av >= 90)
    {
        System.out.println("GRADE IS A+");
    }
     if ((av >= 80) && ( av < 90 ))
    {
        System.out.println("GRADE IS A");
    }
     if (( av >= 70 ) && ( av < 80 ))
    {
        System.out.println("GRADE IS  B");
    }
     if (( av >= 60 ) && ( av < 70 ))
    {
        System.out.println("GRADE IS C");
    }
     if (( av >= 50 ) && ( av < 60 ))
    {
        System.out.println("GRADE IS D");
    }
         if (( av > 40 ) && ( av < 50 ))
    {
        System.out.println("GRADE IS E");
    }
     if (av < 40)
    {
        System.out.println("YOU ARE FAILED");
    }
    }
    
}