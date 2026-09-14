class Solution {
    using ll = long long;
public:
    int smallestDivisor(vector<int>& nums, int threshold) {
        ll low = 1,high = *max_element(nums.begin(),nums.end());
        while(low<=high){
            ll mid = low + (high-low)/2;
            if(check(mid,nums,threshold))
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
    bool check(ll divisor,vector<int>& nums, int threshold){
        ll sum = 0;
        for(int num:nums){
            sum += (num+divisor-1)/divisor;
            if(sum>threshold)   return false;
        }
        return true;
    }
};