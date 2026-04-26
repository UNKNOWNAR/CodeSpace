//153 = 1+125+27
import java.io.*;
public class ANo
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int n = Integer.parseInt(dis.readLine());
        int t = n;
        int an = 0;
        while(t!=0)
        {
            an += Math.pow(t%10,3);
            t=t/10;
        }
        if(an==n)
            System.out.println("Armstrong Number");
        else 
            System.out.println("Not Armstrong Number");
    }
}