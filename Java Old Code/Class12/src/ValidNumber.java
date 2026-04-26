import java.util.*;
public class ValidNumber {
    int n;
    ValidNumber()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int sumDigit(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        if(sum>=10)
            return sumDigit(sum);
        else
            return sum;
    }
    void dovalid()
    {
        n = sumDigit(n);
        if (n==1)
            System.out.println("Valid Number");
        else
            System.out.println("Not A Valid Number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = sc.nextInt();
        ValidNumber valid = new ValidNumber();
        valid.getnum(num);
        valid.dovalid();
    }
}