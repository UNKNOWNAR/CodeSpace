class Solution {
public:
    int firstStableIndex(vector<int>& nums, int k) {
        int n = nums.size(),count = -1,max_val = nums[0];
        vector<int> minm(n);
        minm[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--)
            minm[i] = min(minm[i+1],nums[i]);
        for(int i=0;i<n;i++){
            max_val = max(max_val,nums[i]);
            if(max_val-minm[i]<=k){
                count=i;
                break;
            }
        }
        return count;
    }
};