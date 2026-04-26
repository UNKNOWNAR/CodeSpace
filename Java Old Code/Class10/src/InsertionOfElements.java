import java.util.*;
public class InsertionOfElements
{
    public static void main(String args[]) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of array elements");
       int ne = sc.nextInt();
       int arr[]= new int[ne];
       int arr1[] = new int[ne+1];
       int n = arr.length;
       System.out.println("Enter elements of the array:- ");
       for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt(); 
       System.out.println("Enter the number you want to insert:- ");
       int num = sc.nextInt();
       System.out.println("Enter position of insertion:- ");
       int num1 = sc.nextInt();
       for(int i=0;i<arr1.length;i++)
       {
          if(i<num1)
                arr1[i]=arr[i];
          else if(i==num)
                arr1[i] = num;
          else if(i>num1)
               arr1[i] = arr[i-1];
       }
       for(int i=0;i<arr1.length;i++)
           System.out.println(arr1[i]); 
   }
}