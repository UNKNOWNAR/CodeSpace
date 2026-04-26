import java.io.*;
public class prac2
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int arr[] = new int[10];
        for(int i=0;i<10;i++)
            arr[i] = Integer.parseInt(dis.readLine());
        int n = Integer.parseInt(dis.readLine());
        int f=0,l=9;
        while(f<=l)
        {
            int mid = (f+l)/2;
            if(arr[mid]==n)
            {
                System.out.println("Search Successful");
                System.exit(0);
            }
            else if(n>arr[mid])
                f = mid+1;
            else
                l = mid-1;
        }
        System.out.println("Search Unseccussful");
    }
}