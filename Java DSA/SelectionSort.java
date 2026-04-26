import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < length; i++)
            arr[i] = in.nextInt();
        for(int i = 0; i < length; i++){
            int minindx = i;
            for(int j = i+1; j < length; j++){
                if(arr[j] < arr[minindx])
                    minindx = j;
            }
            if(minindx != i){
                arr[minindx] += arr[i];
                arr[i] = arr[minindx]-arr[i];
                arr[minindx] = arr[minindx]-arr[i];
            }
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i < length; i++)
            System.out.print(arr[i]+" ");
    }
}
