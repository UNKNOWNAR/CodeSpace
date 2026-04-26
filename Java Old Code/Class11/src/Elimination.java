import java.util.*;
public class Elimination
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
             arr[i] = sc.nextInt();
        int narr[] = new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {        
            int n1 = arr[i];
            int f=0;
            for(int j=0;j<i-1;j++)
            {
                if(narr[j]==n1)
                    f++;
            }
            if(f==0)
            {
                narr[k]=n1;
                k++;
            }
        }
        System.out.println("After Elimination");
        for(int i=0;i<k;i++)
             System.out.println(narr[i]);
    }
}