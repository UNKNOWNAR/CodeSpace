import java.util.*;
public class BinarySearch
{
    public static void main(String args[]) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number of Array Elements");
       int ne = sc.nextInt();
       int arr[]= new int[ne];
       int n = arr.length;
       System.out.println("Enter Elements of the Array in Ascending Order:- ");
       for(int i=0;i<arr.length;i++)
           arr[i] = sc.nextInt(); 
       int f = 0;
       int l = arr.length-1;
       System.out.println("Enter Element You Want to search:- ");
       int num = sc.nextInt();
       while(f<=l)
       {
          int mid = (f+l)/2;
          if(num==arr[mid])
          {
              System.out.println("Search Successful");
              System.exit(0);
          }
          if(num>arr[mid])
              f = mid+1;
          else if(num<arr[mid])

              l = mid-1;      
       }
       System.out.println("Search Unsuccessful");
   }
}