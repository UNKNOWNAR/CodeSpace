import java.util.*;
public class Composite {
    int arr[][];
    int m;
    int n;
    Composite(int mm,int nn)
    {
        n = nn;
        m = mm;
        arr = new int[m][n];
    }
    int isComposite(int p)
    {
        for(int i = 2;i<=p/2;i++)
        {
            if (p%i==0)
                return 1;
        }
        return 0;
    }
    void fill()
    {
        int counter = 2;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                while(isComposite(counter)==1)
                {
                    counter++;
                }
                arr[i][j] = counter;
                counter++;
            }
        }
    }
    void display()
    {
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Rows:- ");
        int mm = sc.nextInt();
        System.out.println("Enter Number Of Columns");
        int nn = sc.nextInt();
        Composite ob = new Composite(mm,nn);
        ob.fill();
        ob.display();
    }
}