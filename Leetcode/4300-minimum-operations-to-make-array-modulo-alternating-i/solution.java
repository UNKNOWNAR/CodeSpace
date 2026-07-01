class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int minTotalOps = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                if(i==j) continue;
                int current_ops = 0;
                for(int x=0;x<n;x++){
                    int rem = nums[x]%k;
                    int target = (x%2==0)?i:j;
                    int diff = Math.abs(rem-target);
                    int ops = Math.min(diff,k-diff);
                    current_ops += ops;
                }
                minTotalOps = Math.min(minTotalOps,current_ops);
            }
        }
        return minTotalOps;
    }
}
