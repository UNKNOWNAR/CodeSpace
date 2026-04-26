class Six
{
    public static void main (String args [])
    {
       char C = args[0].charAt(0);
       if ((C == 'Y')||(C == 'y'))
       {
           
           System.out.println("You can sit" );
        }
        else if (( C == 'n') || ( C == 'N'))
        {
            System.out.println("You cannot sit" );
        }
        else
        {
             System.out.println("INVALID INPUT");
            }
    }
}
