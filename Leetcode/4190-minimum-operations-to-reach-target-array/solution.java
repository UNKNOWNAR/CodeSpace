class Solution {
    public int minOperations(int[] nums, int[] target) {
        int op = 0;
        Set<Integer> uniq = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=target[i]&&!uniq.contains(nums[i]))
                uniq.add(nums[i]);
        }
        return uniq.size();
    }
}
