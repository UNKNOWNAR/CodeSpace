import java.util.*;
public class PseudoArithmetic
{
    int n;
    int a[];
    int sum;
    int r;
    boolean ans;
    boolean flag;
    PseudoArithmetic()
    {
        n=0;
        sum=0;
        flag=true;
        ans=false; 
        r=0;
    }
    void accept(int nn)
    {
        Scanner sc = new Scanner(System.in);
        n=nn;
        a = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Number:-");
            a[i] = sc.nextInt();
        }
    }
    boolean check()
    {
        r = a[0]+a[n-1];
        int sum = 0;
        int f=0;
        for(int i=1;i<n/2;i++)
        {
            int temp=a[i]+a[n-i-1];
            if(temp!=r)
            {
                flag = false;
                break;
            }
            sum+=temp;
            f++;
        }
        if(sum==r*f)
            ans=true;
        return(flag && ans);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number OF Numbers:- ");
        int n = sc.nextInt();
        PseudoArithmetic ob = new PseudoArithmetic();
        ob.accept(n);
        if(ob.check())
            System.out.print("It is a PseudoArithmetic Series");
        else
            System.out.print("It is not a PseudoArithmetic Series");
    }   
}