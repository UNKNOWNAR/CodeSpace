import java.util.*;
public class ArrayModify
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements:-");
        int n = sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter Numbers:- ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int v1=arr[0],v2=arr[1];
        for(int i=0;i<n-2;i++)
            arr[i]=arr[i+2];
        arr[n-2]=v1;
        arr[n-1]=v2;
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}