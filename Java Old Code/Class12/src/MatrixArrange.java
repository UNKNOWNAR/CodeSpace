import java.util.*;
public class MatrixArrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][4];
        System.out.println("Enter Input for 4x4 array");
        for(int i=0;i<4;i++)
        {
            System.out.println("Enter Elements in Row "+(i+1));
            for(int j=0;j<4;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3-j;k++)
                {
                    if(arr[i][k]>arr[i][k+1])
                    {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k+1];
                        arr[i][k+1] = temp;
                    }
                }
            }
        }
        for(int i=0;i<4;i++)
        {
            System.out.println();
            for(int j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
        }
    }
}