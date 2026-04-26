import java.util.*;
public class Matrix {
    int Octal(int num)
    {
        int oct = 0;
        int i = 0;
        while (num!=0)
        {
            oct += ((int)Math.pow(8,i))*(num%10);
            i++;
            num /=10;
        }
        return oct;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int M = sc.nextInt();
        System.out.println("Enter the Number of columns");
        int N = sc.nextInt();
        int arr[][] = new int[M][N];
        Matrix ob = new Matrix();
        if(!(M>0&&M<10&&N>2&&N<6))
        {
            System.out.println("Wrong Input");
            System.exit(0);
        }
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.println("Enter Element in Row:"+(i+1)+" Column:-"+(j+1));
                int n=0;
                while(true)
                {
                    n = sc.nextInt();
                    if(n>=0&&n<=7)
                        break;
                    System.out.println("Invalid Input");
                }
                arr[i][j] = n;
            }
        }
        for(int i=0;i<M;i++)
        {
            int n = 0;
            for(int j=0;j<N;j++) {
                System.out.print(arr[i][j]);
                n = n * 10 + arr[i][j];
            }
            System.out.println("\tInteger Equivalent:- "+ob.Octal(n));
        }
    }
}