class Solution {
    public int centeredSubarrays(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            Set<Integer> map = new HashSet<>();

            for(int j=i;j<nums.length;j++){
                map.add(nums[j]);
                sum += nums[j];
                if(map.contains(sum))
                    count++;
            }
        }
        return count;
    }
}
