class Solution {
public:
    int minOperations(vector<int>& nums, int x) {
        int sum = 0,n = nums.size();
        for(auto num:nums)
            sum += num;
        int max_len = 0,l = 0;
        sum -= x;
        if(!sum)
            return n;
        if (sum < 0)
            return -1;
        for(int r=0;r<n;r++){
            sum -= nums[r];
            while(sum<0){
                sum += nums[l];
                l++;
            }
            if(!sum)
                max_len = max(r-l+1,max_len);
        }
        return max_len==0?-1:n-max_len;
    }
};