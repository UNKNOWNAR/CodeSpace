class Solution {
    public int minimumDistance(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if(i==j||j==k||k==i)
                        continue;
                    if(nums[i]==nums[j]&&nums[j]==nums[k])
                        ans = Math.min(ans,Math.abs(i-j)+Math.abs(k-j)+Math.abs(i-k));
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
