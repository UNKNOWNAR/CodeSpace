import java.io.*;
public class AutoMorphic
{
    public static void main(String args[])
    {
        for(long i=0;i<999999999;i++)
        {
            DataInputStream dis = new DataInputStream(System.in);
            long temp = i;
            double n = 0;
            while(temp>0)
            {
                temp /= 10;
                n++;
            }
            temp = i*i-i;
            n = Math.pow(10,n);
            if(temp%n==0)
                System.out.println(i);
        }
    }
}