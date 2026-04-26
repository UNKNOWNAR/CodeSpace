//Sum Combination
import java.util.*;
public class SumComb
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = (n-1)/2;
        for(int i=0;i<=x;i++)
        {
            for(int j=1;j<n;j++)
            {
                int sum = 0;
                for(int k=j;k<i;k++)
                    sum+=k;
                if(sum==n)
                {
                    for(int k=j;k<i;k++)
                        System.out.print(k+",");
                    System.out.println();
                    break;
                }
            }            
        }
        if(n%2!=0)
        {
            x=(n-1)/2;
            System.out.println(x+","+(x+1));
        }
    }
}