public class Divisible
{
    public static void main ( String args [] )
    {
        int a =  Integer.parseInt(args[0]);
        int c = a % 5;
        if (c==0)
        {
            System.out.println(a + " is divisible by 5 ");
        }
        else
        {
            System.out.println(a + " is not divisible by 5 ");
        }
    }
}