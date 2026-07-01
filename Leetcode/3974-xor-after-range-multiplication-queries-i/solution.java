class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod = (int)1e9+7;
        for(int querry[]:queries){
            int l = querry[0];
            int r = querry[1];
            int k = querry[2];
            int v = querry[3];
            while(l<=r){
                nums[l] = (int) ((1L * nums[l] * v) % mod);
                l += k;
            }
        }
        int ans = 0;
        for(int num:nums)
            ans ^= num;
        return ans;
    }
}
