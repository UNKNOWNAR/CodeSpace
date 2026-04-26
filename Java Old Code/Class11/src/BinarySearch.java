import java.util.*;
public class BinarySearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = 10;
        int arr[] = new int[n1];
        for(int i=0;i<n1;i++)
        {
            System.out.println("Enter a Number:-");
            arr[i] = sc.nextInt();
        }
        int f = 0,l=n1-1,mid=1;
        System.out.println("Enter Number you want to Search:-");
        int n  = sc.nextInt();;
        while(f!=mid)
        {
            mid = (f+l)/2;
            if(arr[mid]==n)
            {
                System.out.println("Search Successful");
                System.exit(0);
            }
            else if(arr[mid]<n)
                f=mid-1;
            else
                l=mid+1;

        }
        System.out.println("Search Unsuccessful");
    }
}