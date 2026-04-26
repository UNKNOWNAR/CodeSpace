import java.io.*;
public class Octal
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Decimal Number:- ");
        int dec = Integer.parseInt(dis.readLine());
        int o = 0;
        int i = 0;
        while(dec>1)
        {
            o += (dec%8)*Math.pow(10,i);
            dec /= 8;
            i++;
        }
        o+=(dec%2)*Math.pow(10,i);
        System.out.println(o);
        dec = 0;
        i=0;
        while(o>0)
        {
            dec+=Math.pow(8,i)*(o%10);
            o/=10;
            i++;
        }
        System.out.println(dec);
    }
}