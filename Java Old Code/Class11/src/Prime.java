import java.util.*;
public class Prime
{
    boolean prime(int x)
    {
        int f = 0;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
                f++;
        }
        if(f!=0)
            return false;
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int l = sc.nextInt();
        int arr[] = new int[l];
        for(int i=0;i<l;i++)
            arr[i] = sc.nextInt();
        int max = 0;
        int sum = 0;
        Prime ob = new Prime();
        for(int i=0;i<l;i++)
        {
            if(ob.prime(arr[i]))
            {
                sum +=arr[i];
                max = (max<arr[i])?arr[i]:max;
            }
        }
        System.out.println("Sum :-"+(sum-max));
    }
}