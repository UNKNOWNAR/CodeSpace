import java.util.*;
public class Bubble_Sort
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
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j] += arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}