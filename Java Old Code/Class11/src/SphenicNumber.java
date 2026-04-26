import java.util.*;
public class SphenicNumber
{
    boolean prime(int n)
    {
        int f = 0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                f++;
        }
        if(f==0)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp  = n;
        int f=2,c=0;
        SphenicNumber ob = new SphenicNumber();
        while(n!=f)
        {
            if(n%f==0)
            {
                if(ob.prime(f))
                    c++;
            }
            f++;
        }
        if(c==3)
            System.out.println(temp+" is a Sphenic Number");
        else
            System.out.println(temp+" is not a Sphenic Number");
    }
}