import java.util.*;
public class BinarySearch {
    public static int length = 0;
    static int target = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the number of elements to be inputted
        System.out.println("Enter number of elements:- ");
        length = sc.nextInt();

        // Create an integer array of size length to store the input elements
        int arr[] = new int[length];

        // Prompt user to enter the elements in sorted order and store them in the array
        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < length; i++)
            arr[i] = sc.nextInt();

        // Prompt user to enter the number to be searched
        System.out.println("Enter the number to be searched:");
        target = sc.nextInt();

        // Call binarySearch function to find the target element
        if (binarySearch(arr))
            System.out.println("Search Successful!");
        else
            System.out.println("Search Unsuccessful! Element not found");
    }

    /*
     * Performs binary search on a sorted array to find the target element.
     *  arr should be a sorted array to be searched.
     * @return true if the target element is found, false otherwise.
     */
    public static boolean binarySearch(int[] arr) {
        // Initialize first and last indexes for binary search
        int first = 0;
        int last = length - 1;

        // Perform binary search until the element is found or the search is exhausted
        while (first <= last) {
            int mid = (last + first) / 2;

            if (arr[mid] == target) {
                // If the target element is found, update length and return true
                length = mid;
                return true;
            }
            else if (arr[mid] < target)
                // If the middle element is less than the target, discard the left half
                first = mid + 1;
            else
                // If the middle element is greater than the target, discard the right half
                last = mid - 1;
        }
        // If the element is not found, return false
        return false;
    }
}/*
        Variable Listing:

        - `length`: Represents the number of elements to be searched. It is initially set to 0 and later updated with the user input.
        - `target`: Represents the number to be searched. It is initially set to 0 and later updated with the user input.
        - `arr`: An integer array that stores the sorted input elements provided by the user.

        Description:

        - The code prompts the user to enter the number of elements to be searched and stores it in the variable `length`.
        - An integer array `arr` of size `length` is created to store the input elements.
        - The user is prompted to enter the elements in sorted order, which are then stored in the array `arr`.
        - The user is prompted to enter the number (`target`) to be searched.
        - The `binarySearch` function is called, passing the array `arr`.
        - The `binarySearch` function performs binary search on the array to find the target element.
        - If the target element is found, the `length` variable is updated with the index of the element.
        - The `binarySearch` function returns `true` if the target element is found, and `false` otherwise.
        - The main function checks the return value of `binarySearch` and prints the index*/