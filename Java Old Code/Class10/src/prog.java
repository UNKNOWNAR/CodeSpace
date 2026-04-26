/*Input :
nums= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 }
Output:
Array with every second element is greater than its left and right elements:
[1, 4, 2, 9, 3, 8, 5, 10, 7, 14, 12]*/
import java.io.*;
public class prog
{
    public static void main(String args[])throws IOException
    {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter Length of the Array:- ");
        int l = Integer.parseInt(dis.readLine());
        int arr[] = new int[l];
        for(int i=0;i<l;i++)
            arr[i] = Integer.parseInt(dis.readLine());
        for(int f=0;f!=l-2;f+=2)
        {
            int max = (arr[f]>arr[f+1])?(arr[f]>arr[f+2])?arr[f]:arr[f+2]:(arr[f+1]>arr[f+2])?arr[f+1]:arr[f+2];
            for(int j = f;j<=f+2;j++)
            {
                if(max==arr[f])
                {
                    int n = arr[f];
                    arr[f]=max;
                    max=n;
                }
            }
        }
        for(int i=0;i<l;i++)
            System.out.println(arr[i]);
    }
}