class Solution {
    public int longestBalanced(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> frequency = new HashSet<>();
            int no=0,ne=0;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]%2==0&&!frequency.contains(nums[j]))
                    ne++;
                else if(!frequency.contains(nums[j]))
                    no++;
                frequency.add(nums[j]);
                if(ne==no)
                    ans = Math.max(ans,j-i+1);
            }

        }
        return ans;
    }
}
