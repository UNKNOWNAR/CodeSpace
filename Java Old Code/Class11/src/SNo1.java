import java.io.*;
public class SNo1
{
    int fac(int n)
    {
        int product = 1;
        while(n!=0)
        {
            product *= n;
            n--;
        }
        return product;
    }
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        SNo1 ob= new SNo1();
        int n = 1000;
        System.out.println("Special Numbers are:-");
        while(n!=0)
        {
            int t = n;
            int sum = 0;
            while(t!=0)
            {
                sum += ob.fac(t%10);
                t=t/10;
            }
            if(sum==n)
                System.out.println(sum);
            n--;
        }
    }
}
             