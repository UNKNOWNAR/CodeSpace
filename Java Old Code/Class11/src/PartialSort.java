import java.util.*;
public class PartialSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a Number:-");
            arr[i] = sc.nextInt();
        }
        int f =0;
        for(int i=2;i<n-1;i++)
        {
            for(int j=2;j<n-1-f;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    arr[j] += arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
            f++;
        }
        System.out.println("hi");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}