import java.io.*;
public class Random
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter First Number in the Range:- ");
        int f = Integer.parseInt(dis.readLine());
        System.out.println("Enter Last Number in the Range:- ");
        int l = Integer.parseInt(dis.readLine());
        System.out.println("Enter How Many Random Number:- ");
        int n = Integer.parseInt(dis.readLine());
        int a = n;
        int j = 0;
        int arr[] = new int[n];
        int c = n;
        while(n!=0)
        {
            int r = (int)(Math.random()*((l-f)+1))+f;           
            int k=0;
            int b = 0;
            while(k<a)
            {
                if(arr[k]==r)
                    b++;
                k++;
            }
            if(b==0)
                {
                arr[j]=r;
                j++;
            }
            else 
                continue;
            n--;
        }
        for(int i=0;i<c-1;i++)
        {
            for(int k=0;k<c-i-1;k++)
            {
                if(arr[k]>arr[k+1])
                {
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        for(int i=0;i<a;i++)
            System.out.println(arr[i]);
    }
}