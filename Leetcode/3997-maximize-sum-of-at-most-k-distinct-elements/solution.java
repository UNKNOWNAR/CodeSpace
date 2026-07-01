class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (temp.size() == k)
                break;
            if (temp.isEmpty() || nums[i] != temp.get(temp.size() - 1)) 
                temp.add(nums[i]);
        }
        int[] ans = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) 
            ans[i] = temp.get(i);
        return ans;
    }
}
