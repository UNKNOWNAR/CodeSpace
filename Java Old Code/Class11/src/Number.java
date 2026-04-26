import java.io.*;
public class Number
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter A Number:- ");
        int n = Integer.parseInt(dis.readLine());
        int sum = 0;
        for(int i=0;i<9;i++)
        {
            int f = 0;
            int temp = n;
            while(temp>0)
            {
                if(temp%10==i)
                {
                    sum +=i;
                    f++;
                }
                temp /=10;
            }
            if(f>0)
                System.out.println("Frequency Of "+i+" is "+f);
        }
        System.out.println("Sum Of Digits:- "+sum);
    }
}