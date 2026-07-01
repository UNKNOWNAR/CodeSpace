class Solution {
    public int reverse(int x){
        int temp = 0;
        while(x>0)
        {
            temp = x%10+temp*10;
            x /= 10;
        }
        return temp;
    }
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = nums.length;
        for(int i =nums.length-1;i>-1;i--){
            int rev = reverse(nums[i]);
            if(map.containsKey(rev))
                ans = Math.min(ans,map.get(rev)-i);
            map.put((nums[i]),i);
        }
        if(ans==nums.length)
            return -1;
        return ans;
    }
}
