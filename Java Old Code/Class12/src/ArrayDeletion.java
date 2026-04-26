import java.util.*;
public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements (n) in the array (n >= 10): ");
        int n = sc.nextInt();

        if (n < 10) {
            System.out.println("Error: n should be at least 10.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        System.out.print("Enter the index number to delete (0 to " + (n - 1) + "): ");
        int indexToDelete = sc.nextInt();

        // Check if the given index is valid
        if (indexToDelete < 0 || indexToDelete >= n) {
            System.out.println("Error: Invalid index.");
            return;
        }

        // Shift elements to the left to delete the element at the given index
        for (int i = indexToDelete; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Decrement the size of the array after deletion
        n--;

        // Display the final array after deletion
        System.out.println("Final Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
