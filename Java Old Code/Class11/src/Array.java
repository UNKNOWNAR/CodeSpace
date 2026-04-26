import java.util.*;
public class Array
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
            return true;
        return false;
    }
    void arr(int arr[],int l)
    {
        for(int i=0;i<l;i++)
        {
            if(prime(arr[i]))
                arr[i]=1; 
            else
                arr[i]=0;
        }
        for(int i=0;i<l;i++)
            System.out.println(arr[i]);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a[] = new int[l];
        for(int i=0;i<l;i++)
            a[i] = sc.nextInt();
        Array ob = new Array();
        ob.arr(a,l);
    }
}