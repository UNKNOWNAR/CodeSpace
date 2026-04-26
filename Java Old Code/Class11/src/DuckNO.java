import java.io.*;
public class DuckNO
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int n = Integer.parseInt(dis.readLine());
        while(n>9)
        {
            int t = n;
            int sum =0;
            while(t>0)
            {
                sum += Math.pow(t%10,2);
                t/=10;
            }
            n=sum;
        }
        if(n==1)
            System.out.println("Quack Quack");
        else
            System.out.println("Not Quack Quack");
    }
}