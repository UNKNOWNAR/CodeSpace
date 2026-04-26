//Sum of two very large number
import java.io.*;
public class LargeSum
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter First Number:- ");
        String n = dis.readLine();
        int l = n.length();
        System.out.println("Enter Second Number:- ");
        String n1 = dis.readLine();
        int l1 = n1.length();
        if(l>l1)
        {
            int d = l-l1;
            while(d!=0)
            {
                n1 = "0"+n1;
                d--;
            }
        }
        else if(l<l1)
        {
            int d = l1-l;
            while(d!=0)
            {
                n = "0"+n;
                d--;
            }
        }
        int i = l-1;
        String sum = "";
        int c = 0;
        while(i>=0)
        {
            int s=c;
            s += Integer.parseInt(String.valueOf(n.charAt(i)));
            s += Integer.parseInt(String.valueOf(n1.charAt(i)));
            if(s>9)
            {
                c=1;
                s=s%10;
            }
            else
                c=0;
            sum = Integer.toString(s)+sum;
            i--;
        }
        if(c==1)
            sum = Integer.toString(c)+sum;
        System.out.println("Sum:- "+sum);
    }
}