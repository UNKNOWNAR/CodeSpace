import java.util.*;
public class KeithNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:- ");
        int n = sc.nextInt();
        int temp = n;
        int d = 0;
        while(temp>0)
        {
            temp/=10;
            d++;
        }
        int arr[] = new int[d];
        temp=n;
        for(int i=0;i<d;i++)
        {
            arr[d-i-1] = n%10;
            n/=10;
        }
        n=temp;
        int sum=0;
        for(int j=0;j<d;j++)
            sum+=arr[j];    
        while(sum<=n)
        {
            sum=0;
            for(int j=0;j<d;j++)
                sum+=arr[j];    
            for(int j=0;j<d-1;j++)
                arr[j]=arr[j+1];
            arr[d-1]=sum;  
            if(sum==n)
                System.out.println(n+" is a Keith Number");
        }
    }
}