import java.util.*;
public class SumGP {
    int x;
    int n;
    int sum;
    SumGP()
    {
        x = 0;
        n = 0;
    }
    int power(int p,int q)
    {
        if(q==0)
            return 1;
        else
            return (power(p,q-1)*p);
    }
    int getSum(int p,int q)
    {
        if(q==0)
            return 1;
        else
            return (getSum(p,q-1)+power(p,q));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumGP sum = new SumGP();
        System.out.println("Enter x:- ");
        int x = sc.nextInt();
        System.out.println("Enter n:- ");
        int n = sc.nextInt();
        System.out.println("Sum Of GP:- "+sum.getSum(x,n));
    }
}
