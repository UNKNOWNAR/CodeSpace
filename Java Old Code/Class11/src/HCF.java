import java.io.*;
public class HCF
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("ENTER FIRST NUMBER:- ");
        int n = Integer.parseInt(dis.readLine());
        System.out.println("ENTER SECOND NUMBER:- ");
        int n1 = Integer.parseInt(dis.readLine());
        int hcf = 1;
        for(int i=2;i<=n||i<=n1;i++)
        {
            if(n%i==0&&n1%i==0)
                hcf = i;
        }
        System.out.println("HCF:- "+hcf);
    }
}