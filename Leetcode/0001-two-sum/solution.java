class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complement = new HashMap<>();
        complement.put(target-nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(complement.containsKey(nums[i]))
                return new int[] {complement.get(nums[i]), i};
            else
                complement.put(target-nums[i],i);
        }
        return new int[2];
    }
}
