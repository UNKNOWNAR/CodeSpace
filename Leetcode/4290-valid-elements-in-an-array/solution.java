class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        boolean isValid[] = new boolean[n];
        List<Integer> ans = new ArrayList<>();
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                isValid[i] = true;
                max = nums[i];
            }
        }
        max = 0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]>max){
                isValid[i] = true;
                max = nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(isValid[i])
                ans.add(nums[i]);
        }
        return ans;
    }
}
