class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> sum = new HashMap<>();
        int maxLen = 0;
        int currSum = 0;
        sum.put(0,-1); 
        for(int i=0;i<nums.length;i++){
            currSum += (nums[i]==1)?1:-1;
            if(sum.containsKey(currSum))
                maxLen = Math.max(maxLen,i-sum.get(currSum));
            else
                sum.put(currSum,i);
        }
        return maxLen;
    }
}
