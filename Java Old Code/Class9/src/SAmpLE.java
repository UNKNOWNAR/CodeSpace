import java.util.*;
public class SAmpLE
{
    public static void main (String args[])
    { 
        Scanner dis = new Scanner(System.in);
        System.out.println("Enrter Number");
        int a = dis.nextInt();
        System.out.println("Enter Number");
        int b = dis.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
