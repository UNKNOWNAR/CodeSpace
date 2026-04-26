import java.io.*;
public class prac1
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        int n = Integer.parseInt(dis.readLine());
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(dis.readLine());
        int n1= Integer.parseInt(dis.readLine());
        int f=0,l=n-1;
        while(f<=l)
        {
            int mid = (f+l)/2;
            if(arr[mid]==n1)
            {
                System.out.println("Search Successful");
                System.exit(0);
            }
            else if(arr[mid]<n1)
                f = mid+1;
            else
                l=mid-1;
        }
        System.out.println("Search Unsuccessful");
    }
}