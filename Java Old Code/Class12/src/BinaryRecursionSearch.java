import java.util.*;
public class BinaryRecursionSearch {
    int RecursiveSearch(int arr[],int f,int l,int num)
    {
        if(f>l)
            return 0;
        int mid = (f+l)/2;
        if(num == arr[mid])
            return 1;
        else if(arr[mid]>num) {
            l = mid-1;
            if(RecursiveSearch(arr, f, l,num)==1)
                return 1;
            else
                return 0;
        }
        else {
            f = mid+1;
            if (RecursiveSearch(arr, f, l, num) == 1)
                return 1;
            else
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter A Number");
        for(int i=0;i<10;i++)
        {
            arr[i] =sc.nextInt();
        }
        System.out.println("Enter A Number:- ");
        int num =sc.nextInt();
        BinaryRecursionSearch ob = new BinaryRecursionSearch();
        if(ob.RecursiveSearch(arr,0,9,num)==1)
            System.out.println("Number Found");
        else
            System.out.println("Number not Found");
    }
}
