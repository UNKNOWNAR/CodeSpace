import java.util.*;
public class Transpose {
    int arr[][];
    int m;
    Transpose(int mm)
    {
        m = mm;
        arr = new int[m][m];
    }
    void fillarray()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.println("Enter Element in Row "+(i+1)+" and Column "+(j+1));
                arr[i][j] = sc.nextInt();
            }
        }
    }
    void transpose()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for (int j = 0; j < m; j++)
            {
                if(i<j)
                {
                    arr[i][j] += arr[j][i];
                    arr[j][i] = arr[i][j] - arr[j][i];
                    arr[i][j] = arr[i][j] - arr[j][i];
                }
            }
        }
    }
    void display()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Transpose matrix = new Transpose(3);
        matrix.fillarray();
        matrix.display();
        System.out.println();
        matrix.transpose();
        matrix.display();
    }
}