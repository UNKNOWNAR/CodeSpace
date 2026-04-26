import java.util.*;
public class ArrayArrange
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements:-");
        int n = sc.nextInt();
        int arr[] =new int[n];
        int narr[] = new int[n];
        System.out.println("Enter Numbers:- ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int l=0;
        for(int i=0;i<n;i++)
        {
            int max = arr[0];
            int k=0;
            int mid=n/2;
            for(int j=1;j<n;j++)
            {
                int n1 = arr[j];
                k = (max<n1)?j:k;
                max = (max<n1)?n1:max;
            }
            if(l==0)
            {
                arr[k]=0;
                narr[mid]=max;
            }
            else if(l%2!=0)
            {
                int m = mid+(l+1)/2;
                arr[k]=0;
                narr[m]=max;
            }
            else
            {
                int m = mid-(l+1)/2;
                arr[k]=0;
                narr[m]=max;
            }
            l++;
        }
        for(int o=0;o<n;o++)
            System.out.println(narr[o]);
    }
}