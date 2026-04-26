import java.io.*;
public class AsscendingNo
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter A Number:- ");
        int n = Integer.parseInt(dis.readLine());
        String asc = "";
        for(int i=0;i<=9;i++)
        {
            int f = 0;
            int temp = n;
            while(temp>0)
            {
                if(temp%10==i)
                    asc = asc+Integer.toString(i);
                temp /=10;
            }
        }
        System.out.println("Ascending Order:- "+asc);
    }
}
    