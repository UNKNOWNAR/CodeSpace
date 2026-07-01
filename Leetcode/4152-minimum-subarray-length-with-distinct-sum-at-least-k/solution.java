class Solution {
    public int minLength(int[] nums, int k) {
        int minLength = nums.length+1;
        int left = 0;
        long currentDistinctSum = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int right = 0; right < nums.length; right++) {
            int val = nums[right];
            if(!countMap.containsKey(val)){
                countMap.put(val,1);
                currentDistinctSum += val;
            }
            else
                countMap.put(val,countMap.get(val)+1);
            while(currentDistinctSum>=k){
                minLength = Math.min(right-left+1,minLength);
                int leftVal = nums[left];
                countMap.put(leftVal,countMap.get(leftVal)-1);
                if(countMap.get(leftVal)==0){
                    currentDistinctSum -= leftVal;
                    countMap.remove(leftVal);
                }
                left++;
            }
        }
        return minLength==nums.length+1?-1:minLength;
    }
}
