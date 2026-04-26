import java.io.*;
public class Binary
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Decimal Number:- ");
        int dec = Integer.parseInt(dis.readLine());
        int b = 0;
        int i = 0;
        while(dec>1)
        {
            b += (dec%2)*Math.pow(10,i);
            dec = dec/2;
            i++;
        }
        b+=(dec%2)*Math.pow(10,i);
        System.out.println(b);
        System.out.println("Enter Binary Number:- ");
        b = Integer.parseInt(dis.readLine());
        dec = 0;
        i=0;
        while(b>0)
        {
            dec+=Math.pow(2,i)*(b%10);
            b/=10;
            i++;
        }
        System.out.println(dec);
    }
}