import java.util.*;
public class AbuntdantNo
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=1;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                sum += i;
        }
        if(sum>n)
            System.out.println(n+" It is a abundant no");
        else
            System.out.println(n+" It is not a abundant no");
    }
}