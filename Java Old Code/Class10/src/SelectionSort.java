import java.util.*;
public class SelectionSort
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
          int min = i;
          for(int j = i+1;j<n;j++)
          {
             if(arr[min]>arr[j])
             {
                 min = j;
             }
          }
          if(min!=i)
          {
              int temp = arr[min];
              arr[min] = arr[i];
              arr[i] = temp;
           }
       }
       for(int i=0;i<arr.length;i++)
           System.out.println(arr[i]);
   }
}