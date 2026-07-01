class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int num:nums){
            if(unique.contains(num))
                ans.add(num);
            else
                unique.add(num);
        }
        return ans;
    }
}
