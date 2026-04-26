/*Given an array arr[] of size n, the task is to return an equilibrium index (if any) or -1 if no equilibrium index exists.
The equilibrium index of an array is an index such that the sum of all elements at lower indexes equals the sum of all
elements at higher indexes.

Note: When the index is at the start of the array, the left sum is 0, and when it's at the end, the right sum is 0.

Examples:

Input: arr[] = [1, 2, 0, 3]
Output: 2
Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.

Input: arr[] = [1, 1, 1, 1]
Output: -1
Explanation: There is no equilibrium index in the array.

Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
Output: 3
Explanation: The sum of left of index 3 is -7 + 1 + 5 = -1 and sum on right of index 3 is -4 + 3 + 0 = -1.*/
import java.util.*;
public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        int prefixsum = 0;
        for(int i=0;i<arr.length;i++){
            if(2*prefixsum == sum-arr[i]) {
                System.out.println(i);
                System.exit(0);
            }
            prefixsum += arr[i];
        }
        System.out.println(-1);
    }
}
