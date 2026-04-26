import java.util.*;
public class DDA
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                arr[i][j] = sc.nextInt();
        }
        int sum=0,sumu=0,suml=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    sum += arr[i][i];
                else if(j>i)
                    sumu += arr[i][j];
                else
                    suml += arr[i][j];
            }
        }
        System.out.println("Sum of Left Diagonal:- "+sum);
        System.out.println("Sum of Upper HAlf of Left Diagonal:- "+sumu);
        System.out.println("Sum of Lower HAlf of Left Diagonal:- "+suml);
        sum=0;sumu=0;suml=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j+i==n-1)
                    sum += arr[i][j];
                else if((j+i)<(n-1))
                    sumu += arr[i][j];
                else 
                    suml += arr[i][j];
            }
        }
        System.out.println("Sum of Right Diagonal:- "+sum);
        System.out.println("Sum of Upper half of Right Diagonal:- "+sumu);
        System.out.println("Sum of Lower half of Rightt Diagonal:- "+suml); 
        sum=0;sumu=0;
        int mid = (n-1)/2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]!=arr[mid][mid])
                    sum+=arr[i][j];
                if(i==mid||j==mid)
                    sumu += arr[i][j];
            }
        }
        System.out.println("Sum of Border Elements:- "+sum);
        System.out.println("Sum of Middle Rows and Columns:- "+sumu);
    }
}