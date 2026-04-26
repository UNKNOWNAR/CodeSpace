import java.io.*;
public class Pronic
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int n = Integer.parseInt(dis.readLine());
        for(int i=0;i<n;i++)
        {
            if(n==i*(i+1))
            {
                System.out.println("Pronic Number");
                System.exit(0);
            }
        }
        System.out.println("Not Pronic Number");
    }
}