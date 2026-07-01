class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int indx = 0;
        while(indx<nums.length){
            String temp = String.valueOf(nums[indx]);
            int prevIndx = indx;
            while(indx<nums.length-1&&nums[indx]==nums[indx+1]-1)
                indx++;
            if(indx!=prevIndx)
                temp += "->"+ String.valueOf(nums[indx]);
            indx++;
            ans.add(temp);
        }
        return ans;
    }
}
