import java.util.*;
public class Number
{
    long num;
    long sum;
    Number(long n)
    {
        num = n;
    }
    void digitFrequency()
    {
        long temp = num;
        int frequency[] =new int[9];
        while(temp>0)
        {
            long digit = temp%10;
            frequency[(int)digit-1] += 1;
            temp/=10;
        }
        System.out.println("Digit\tFrequency");
        for(int i=0;i<9;i++)
        {
            if(frequency[i]!=0)
                System.out.println("  "+(i+1)+"\t"+frequency[i]);
        }
    }
    void digitFrequency1()
    {
        System.out.println("Digit\tFrequency");
        long temp = num;
        int nod = 0;
        while(temp>0)
        {
            temp/=10;
            nod++;
        }
        long elementdone[] = new long[nod];
        temp = num;
        int flag1= 0;
        while(temp>0)
        {
            long digit  = temp % 10;
            int flag = 0;
            for(int i=0;i<flag1;i++)
            {
                if(digit==elementdone[i])
                    flag++;
            }
            if(flag==0)
            {
                long temp1 = num;
                while(temp1>0)
                {
                    if(digit==temp1%10)
                        flag++;
                    temp1/=10;
                }
                elementdone[flag1] = digit;
                System.out.println("  "+digit+"       "+flag);
                flag1++;
            }
            temp/=10;
        }
    }
    void sumDigits()
    {
        long temp = num;
        int sum = 0;
        while(temp>0)
        {
            sum+= temp%10;
            temp/=10;
        }
        System.out.println("Sum Of Digits:- "+sum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:-");
        long num = sc.nextLong();
        Number no = new Number(num);
        no.digitFrequency();
        no.sumDigits();
    }
}