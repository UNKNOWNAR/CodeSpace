import java.io.*;
public class GCD
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int n = Integer.parseInt(dis.readLine());
        int n1 = Integer.parseInt(dis.readLine());
        int rem = n1+n;
        n = (n>n1)?n:n1;
        n1 = rem-n;
        rem = n%n1;
        while(rem!=0)
        {
            n=n1;
            n1 = rem;
            rem = n%n1;
        }
        System.out.println(n1);
    }
}