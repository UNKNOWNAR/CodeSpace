class Solution {
    using ll = long long;
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        ll sum = 0,n = nums.size(),size = n+1,l=0;
        for(int r=0;r<n;r++){
            sum += nums[r];
            while(sum>=target){
                size = min(r-l+1,size);
                sum -= nums[l];
                l++;
            }
        }
        return size > n ? 0 : size;
    }
};