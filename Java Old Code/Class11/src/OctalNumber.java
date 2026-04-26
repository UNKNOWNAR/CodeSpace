import java.util.*;
public class OctalNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oct = 0;
        int f=0;
        while(n!=0)
        {
            int r  = n%8;
            oct=oct+r*(int)(Math.pow(10,f));
            n/=8;
            f++;
        }
        System.out.println(oct);
    }
}