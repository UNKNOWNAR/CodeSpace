import java.util.*;
public class Recursion
{
    int sum =0;
    void Rec(int i)
    {
        if(i!=0)
        {
            sum+=i%10;
            i/=10;
            Rec(i);
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int i = sc.nextInt();
        Recursion ob = new Recursion();
        ob.Rec(i);
    }
}