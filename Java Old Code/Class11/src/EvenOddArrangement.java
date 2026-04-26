import java.util.*;
public class EvenOddArrangement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int e = 0,o=9;
        for(int i=0;i<10;i++)
        {
            int n=sc.nextInt();
            if(n%2==0)
            {
                arr[e]=n;
                e++;
            }
            else
            {
                arr[o]=n;
                o--;
            }
        }
        for(int i=0;i<e-1;i++)
        {
            for(int j=0;j<e-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j] += arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]-=arr[j+1];
                }
            }
        }
        int f = 0;
        for(int i=e;i<9;i++)
        {
            for(int j=e;j<9-f;j++)
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
        System.out.println("After Arrangement");
        for(int i=0;i<10;i++)
            System.out.println(arr[i]);
    }
}