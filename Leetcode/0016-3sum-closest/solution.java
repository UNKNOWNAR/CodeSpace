class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = (int)1e5;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int p1 = i+1;
            int p2 = n-1;
            while(p1<p2){
                if(nums[i]+nums[p1]+nums[p2]==target)
                    return nums[i]+nums[p1]+nums[p2];
                else if(nums[i]+nums[p1]+nums[p2]>target){
                    if(Math.abs(ans-target)>Math.abs(nums[i]+nums[p1]+nums[p2]-target))
                        ans = nums[i]+nums[p1]+nums[p2];
                    p2--;
                }
                else{
                    if(Math.abs(ans-target)>Math.abs(nums[i]+nums[p1]+nums[p2]-target))
                        ans = nums[i]+nums[p1]+nums[p2];
                    p1++;
                }
            }
        }
        return ans;
    }
}
