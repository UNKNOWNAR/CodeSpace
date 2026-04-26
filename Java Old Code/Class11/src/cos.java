import java.io.*;
public class cos
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
        cos ob= new cos();
        System.out.println("Enter angle in radian:-");
        int n = Integer.parseInt(dis.readLine());
        double cos = 0.0;
        for(int i=0;i<=n;i+=2)
        {
            cos = ((i/2)%2==0)?cos+(Math.pow(n,i)/(double)(ob.fac(i))):cos-(Math.pow(n,i)/(double)(ob.fac(i)));
        }
        System.out.println(cos);
    }
}
             