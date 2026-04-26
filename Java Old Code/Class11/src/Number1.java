import java.util.*;
public class Number1
{
    long num;
    int c;
    int s;
    Number1()
    {
        num=0;
    }
    Number1(long a)
    {
        num=a;        
    }
    void digitFrequency()
    {
        long temp = num;
        int d = 0;
        while(temp!=0)
        {
            temp/=10;
            d++;
        }
        long arr[] = new long[d];
        temp=num;
        for(int i=0;i<d;i++)
        {
            arr[i]=temp%10;
            temp/=10;
        }
         for(int i=0;i<d;i++)
        {
            c=0;
            if(arr[i]%2==0)
            {
                c++;
                for(int j=i+1;j<d;j++)
                {
                    if(arr[j]==arr[i])
                    {
                        c++;
                        arr[j]=1;
                    }
                }
                System.out.println("Frequency of "+arr[i]+" is:- "+c);
            }
        }
    }
    int sumDigits(long num)
    {
        long temp = num;
        int sum =0 ;
        while(temp!=0)
        {
            long n = temp%10;
            if(n%2!=0)
                sum+=n;
            temp/=10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        long n = sc.nextLong();
        Number1 ob1 = new Number1(n);
        ob1.digitFrequency();
        ob1.sumDigits(n);
        System.out.println("Sum of digits:- "+ob1.sumDigits(n));
    }
}