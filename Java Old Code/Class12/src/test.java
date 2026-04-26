import java.util.*;
class test {
    public static void main(String args[]){
        Scanner sc = new Scanner();
        System.out.println("Enter Number of numbers");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter Target");
        int target = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    System.out.println("["+i+","j+"]")
                    System.exit(0)
                }
            }
        }
        System.out.println("Such Combination doesnot exist");
    }
}