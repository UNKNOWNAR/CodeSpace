import java.util.*;
public class BSearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<10;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter A NUmber");
        int n = sc.nextInt();
        int f=0,l=9,mid=(f+l)/2;
        while(f<=l)
        {
            if(n>arr[mid])
                f=mid+1;
            else if(n<arr[mid])
                l=mid-1;
            else
            {
                System.out.println("Search Successful");
                System.exit(0);
            }
            mid=(f+l)/2;
        }
        System.out.println("Search Unsuccessful");
    }
}