import java.io.*;
public class Binary1
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Decimal Number:- ");
        int dec = Integer.parseInt(dis.readLine());
        double bin = 0.0;
        while(dec>1)
        {
            int n = 0;
            while(dec>=Math.pow(2,n))
                n++;
            n--;
            dec -= Math.pow(2,n);
            bin += Math.pow(10,n);
        }
        bin += dec;
        System.out.println(Double.toString(bin));
    }
}