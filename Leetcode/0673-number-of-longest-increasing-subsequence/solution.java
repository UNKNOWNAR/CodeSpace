class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 0) 
            return 0;
        int[] dp1 = new int[n];
        int count[] = new int[n];
        Arrays.fill(dp1, 1);
        Arrays.fill(count, 1);
        int maxi = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]&&1 + dp1[j]>dp1[i]){ 
                    dp1[i] = 1 + dp1[j];
                    count[i] = count[j];
                }
                else if(nums[i] > nums[j]&&1 + dp1[j]==dp1[i])
                    count[i] += count[j];
            }
            maxi = Math.max(maxi,dp1[i]);
        }
        int totalCount=0;
        for(int i=0;i<n;i++){
            if(maxi==dp1[i])
                totalCount += count[i];
        }
        return totalCount;
    }
}
