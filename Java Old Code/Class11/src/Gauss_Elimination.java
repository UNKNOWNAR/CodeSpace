import java.util.*;
public class Gauss_Elimination
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double arr[][] = new double[3][4];
        double ans[] = new double[3];
        int x,y,z=0;
        for(int i=0;i<3;i++)
            ans[i]=0;        
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter "+(i+1)+" equation constatnts");
            for(int j=0;j<4;j++)
                arr[i][j] = sc.nextDouble();
        } 
        int k=0;
        for(int i=0;i<3;i++)
        {
            for(int j=1;j<3-i;j++)
            {
                double r = arr[k+j][k]/arr[k][k];
                j+=k;
                for(int l=0;l<4;l++)
                    arr[j][l] = arr[j][l]-arr[k][l]*r;
            }
            k++;
        }
        k--;
        for(int i=0;i<3;i++)
        {
            double r = arr[k][k];
            for(int j=0;j<3;j++)
            {
                if(k!=j)
                    ans[i] -= arr[2-i][j]*ans[2-j]/r;
            }
            ans[i]+=arr[2-i][3]/r;
            k--;
        }
        for(int i=0;i<3;i++)
        {
            System.out.println(ans[i]);
        }
    }
}  