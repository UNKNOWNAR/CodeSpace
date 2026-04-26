import java.util.*;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        int left=0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            while(sum>target){
                sum -= arr[left];
                left++;
            }
            if(sum == target){
                System.out.println((left+1)+" "+(i+1));
                System.exit(0);
            }
        }
        System.out.println("-1");
    }
}
