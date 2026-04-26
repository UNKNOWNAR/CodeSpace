import java.util.*;
public class Shopping
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the customer");
        String a=sc.nextLine();
        System.out.println("Enter address");
        String b=sc.nextLine();
        System.out.println("Enter phone number");
        String c=sc.next();
        System.out.println("Enter monthly rental charge");
        long d=sc.nextLong();
        System.out.println("Enter number of calls");
        int e=sc.nextInt();
        Bill ob=new Bill(a,b,c,d,e);
        ob.cal();
        ob.show();
    }
}