import java.util.*;

public class MergeSort {
    int[] merge_sort(int[] arr) {
        int l = arr.length;
        if (l <= 1) return arr;
        int mid = l / 2;
        int[] left = new int[mid];
        int[] right = new int[l - mid];
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        left = merge_sort(left);
        for(int i = mid; i < l; i++)
            right[i-mid] = arr[i];
        right = merge_sort(right);
        return merge(left, right);
    }
    int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0,indx=0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                result[indx++] = left[i++];
            else
                result[indx++] = right[j++];
        }
        while( i < left.length)
            result[indx++] = left[i++];
        while(j < right.length)
            result[indx++] = right[j++];
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < length; i++)
            arr[i] = sc.nextInt();
        MergeSort ob = new MergeSort();
        int[] result = ob.merge_sort(arr);
        System.out.println("Sorted array");
        for(int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}
