/*Write a program in Java to store 20 different numbers in a SDA and arrange them in such a way that all the
even numbers are arranged in ascending order and all the odd numbers in descending order.*/
import java.util.*;
public class EvenOddArange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements in the Array:-");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        for (int i = 0; i < n; i++)
        {
            if(arr[i]%2==0)
            {
                arr[flag] += arr[i];
                arr[i] = arr[flag]-arr[i];
                arr[flag] = arr[flag]-arr[i];
                flag++;
            }
        }
        for(int i=0;i<flag-1;i++)
        {
            for(int j=0;j<flag-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j] += arr[j+1];
                    arr[j+1] = arr[j]-arr[j+1];
                    arr[j] = arr[j]-arr[j+1];
                }

            }
        }
        for(int i=0;i<flag-1;i++)
        {
            for(int j=0;j<flag-i-1;j++)
            {
                int h = j+flag;
                if(arr[h]<arr[h+1])
                {
                    arr[h] += arr[h+1];
                    arr[h+1] = arr[h]-arr[h+1];
                    arr[h] = arr[h]-arr[h+1];
                }

            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}