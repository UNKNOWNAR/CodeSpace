import java.util.*;
public class Rearrange
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int pos1 = sc.nextInt()-1;
        int pos2 = sc.nextInt()-1;
        int item = sc.nextInt();
        for(int i=pos2;i>pos1;i--)
            arr[i]=arr[i-1];
        arr[pos1]=item;
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}