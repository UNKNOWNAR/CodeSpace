import java.util.*;
public class LinearSearch
{
    public static void main(String args[]) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of array elements");
       int ne = sc.nextInt();
       int arr[]= new int[ne];
       int n = arr.length;
       System.out.println("Enter elements of the array:- ");
       for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt(); 
       System.out.println("Enter the number you want to search:- ");
       int num = sc.nextInt();
       for(int i=0;i<arr.length;i++)
       {
          if(num==arr[i])
          {
              System.out.println("Search Successful");
              System.exit(0);
           }
        }
       System.out.println("Search Unsuccessful");
   }
}