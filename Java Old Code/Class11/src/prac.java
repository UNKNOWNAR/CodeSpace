import java.util.*;
public class prac
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int l = 10;
        int arr[] = new int[l];
        for(int i=0;i<l;i++)
            arr[i] = sc.nextInt();
        for(int i=0;i<l;i++)
        {
            int min = arr[i];
            int in = i;
            for(int j=i+1;j<l;j++)
            {
                min = (min>arr[j])?arr[i]:min;
                in = (min>arr[j])?j:in;
            }
            if(in!=i)
            {
                arr[in]=arr[i];
                arr[i]=min;
            }
        }
        for(int i=0;i<l;i++)
            System.out.println(arr[i]);
    }
}