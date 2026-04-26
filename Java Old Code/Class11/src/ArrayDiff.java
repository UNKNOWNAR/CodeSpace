import java.util.*;
public class ArrayDiff
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int arr[] = new int[6];
        for(int i=0;i<6;i++)
            arr[i] = sc.nextInt();
        for(int i=0;i<5;i++)
        {
            int d=arr[i]-arr[i+1];
            d*=(d<0)?-1:1;
            System.out.println("Difference:- "+d);
        }
    }
}