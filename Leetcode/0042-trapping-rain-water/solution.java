class Solution {
    public int trap(int[] height) {
        int ans = 0; 

        int lmax = height[0];
        int rmax = height[height.length-1];

        int left = 1;
        int right = height.length-2;

        while(left<=right)
        {
            if(lmax<rmax){
                if(height[left]>lmax)
                    lmax = height[left];
                ans += lmax-height[left];
                left++;
            }
            else{
                if(height[right]>rmax)
                    rmax = height[right];
                ans += rmax-height[right];
                right--;
            }
        }
        return ans;
    }
}
