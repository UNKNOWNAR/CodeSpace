//145=1!+4!+5!
import java.io.*;
public class SNo
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
        int n = Integer.parseInt(dis.readLine());
        int t = n;
        int sum = 0;
        SNo ob= new SNo();
        while(t!=0)
        {
            sum += ob.fac(t%10);
            t=t/10;
        }
        if(sum==n)
            System.out.println("Special Number");
        else 
            System.out.println("Not Special Number");
    }
}