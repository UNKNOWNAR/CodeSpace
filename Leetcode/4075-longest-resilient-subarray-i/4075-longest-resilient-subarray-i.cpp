class Solution {
public:
    int resilientSubarray(vector<int>& nums, int k) {
        int n =nums.size(),ans = 1,l = 0,sum = nums[l];
        for(int r=1;r<n;r++){
            if(nums[l]%k==nums[r]%k){
                sum = (sum+nums[r])%k;
                if(sum==nums[l]%k)
                    ans = max(ans,r-l+1);
            }
            else{
                sum = nums[r]%k;
                l = r;
            }
        }
        return ans;
    }
};