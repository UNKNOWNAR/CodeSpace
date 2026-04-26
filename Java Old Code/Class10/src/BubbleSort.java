import java.util.*;
public class BubbleSort
{
    public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number of Array Elements");
       int ne = sc.nextInt();
       int arr[]= new int[ne];
       int n = arr.length;
       System.out.println("Enter Elements of the Array:- ");
       for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt();
       for(int i =0;i<n-1;i++)
       {
          for(int j = 0;j<n-i;j++)
          {
              if(arr[j]>arr[j+1])
              {
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                }
            }
       }
       for(int i=0;i<arr.length;i++)
           System.out.println(arr[i]);
   }
}