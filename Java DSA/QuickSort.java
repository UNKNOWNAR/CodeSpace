import java.util.*;

public class QuickSort {
    void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivot = arr[left];
        int i = left;
        int j = right;

        while (i < j) {
            while (i < j && arr[j] >= pivot) j--;
            while (i < j && arr[i] < pivot) i++;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        quickSort(arr, left, j);
        quickSort(arr, j + 1, right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}