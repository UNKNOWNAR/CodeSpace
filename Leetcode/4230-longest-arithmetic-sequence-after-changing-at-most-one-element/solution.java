class Solution {
    public int longestArithmetic(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];//arithmetic sequence ending at nums[i]
        left[0] = 0;//only one element in the sequence nums[0]
        left[1] = 2;//two element in the sequence nums[0] and nums[1]
        for(int i=2;i<n;i++){
            if(nums[i-1]-nums[i]==nums[i-2]-nums[i-1])
                left[i] = left[i-1]+1;
            else
                left[i] = 2;//two element in the sequence nums[i-1] and nums[i]
        }
        int right[] = new int[n];//length of the longest arithmetic subarray starting at index i.
        right[n-1] = 0;
        right[n-2] = 2;
        for(int i=n-3;i>=0;i--){
            if(nums[i+2]-nums[i+1]==nums[i+1]-nums[i])
                right[i] = right[i+1]+1;
            else
                right[i] = 2;//two element in the sequence nums[i] and nums[i+1]
        }
        int ans = 3;
        for(int i=0;i<nums.length;i++){
            if(i<n-1)
                ans = Math.max(ans,right[i+1]+1);
            if(i>0)
                ans = Math.max(ans,left[i-1]+1);
            if(i>0&&i<n-1){
                int diff = nums[i+1]-nums[i-1];
                if(diff%2!=0)//if diff is not even here, commmon difference in sequence wont be integer
                    continue;
                int length = 3;
                if(i>=2&&nums[i-1]-nums[i-2]==diff/2)
                    length += left[i-1]-1;
                if(i<=n-3&&nums[i+2]-nums[i+1]==diff/2)
                    length += right[i+1]-1;
                ans = Math.max(length,ans);
            }
        }
        return ans;
    }
}
