import java.util.*;
public class EvenOddArang
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int n = 10;
        int arr[] = new int[n];
        int e=0,o=0;
        for(int i=0;i<n;i++)
        {
            int n1 = sc.nextInt();
            arr[i] = n1;
            if(n1%2==0)
                e++;
            else
                o++;
        }
        int even[] = new int[e];
        int odd[] = new int[o];
        e=0;o=0;
        for(int i=0;i<n;i++)
        {
            int n1=arr[i];
            if(n1%2==0)
            {
                even[e] = n1;
                e++;
            }
            else
            {
                odd[o] = n1;
                o++;
            }
        }
        for(int i=0;i<e-1;i++)
        {
            for(int j=0;j<e-i-1;j++)
            {
                if(even[j]>even[j+1])
                {
                    even[j] += even[j+1];
                    even[j+1] = even[j] - even[j+1];
                    even[j] -= even[j+1];
                }
            }
        }
        for(int i=0;i<o-1;i++)
        {
            for(int j=0;j<o-i-1;j++)
            {
                if(odd[j]<odd[j+1])
                {
                    odd[j] += odd[j+1];
                    odd[j+1] = odd[j] - odd[j+1];
                    odd[j] -= odd[j+1];
                }
            }
        }
        e=0;o=0;
        for(int i=0;i<n;i++)
        {
            int n1=arr[i];
            if(n1%2==0)
            {
                arr[i]=even[e];
                e++;
            }
            else
            {
                arr[i]=odd[o];
                o++;
            }
        }
        System.out.println("After Arrangement");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}