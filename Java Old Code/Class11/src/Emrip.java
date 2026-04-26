import java.util.*;
public class Emrip
{
    boolean prime(int n)
    {
        int f = 0;
        for(int i=2;i<n;i++)
            f+=(n%i==0)?1:0;
        if(f!=0)
            return false;
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Emrip ob = new Emrip();
        System.out.println("Enter A Number:-");
        int n = sc.nextInt();
        int temp=n,rev=0;
        while(temp!=0)
        {
            rev =rev*10+ (temp)%10;
            temp/=10;
        }
        temp=0;
        if(ob.prime(n))
            temp++;
        if(ob.prime(rev))
            temp++;
        if(temp==2)
            System.out.println(n+" is a Emrip Number");
        else
            System.out.println(n+"is not a Emrip Number:-");
    }   
}