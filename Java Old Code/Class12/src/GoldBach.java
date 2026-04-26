import java.util.*;
public class GoldBach {
    boolean prime(int n)
    {
        int f = 0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                f++;
        }
        if(f!=0)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GoldBach ob = new GoldBach();
        System.out.println("Enter A Number");
        int n = sc.nextInt();
        int x = 0;
        if(!(n%2==0&&n>9&&n<50)) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        System.out.println("Prime pair are:-");
        for(int i=3;i<=43;i+=2)
        {
            if(ob.prime(i))
            {
                for(int j=i+2;j<=43;j+=2)
                {
                    if(i+j==n&&ob.prime(j))
                        System.out.println(i + "\t" + j);
                }
            }
        }
    }
}