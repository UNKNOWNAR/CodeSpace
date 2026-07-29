class Solution {
    using ll = long long;
public:
    int splitArray(vector<int>& nums, int k) {
        ll low = *max_element(nums.begin(),nums.end());
        ll high = 0;
        for(int num:nums)
            high += num;
        while(low<=high){
            ll mid = low + (high-low)/2;
            if(check(mid,nums,k))
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
    bool check(ll min_sum,vector<int>& nums, int k){
        int count = 1;
        ll sum = 0;
        for(int num:nums){
            if(sum+num>min_sum){
                count++;
                sum = num;
            }
            else
                sum += num;
            if(count>k)
                return false;
        }
        return true;
    }
};