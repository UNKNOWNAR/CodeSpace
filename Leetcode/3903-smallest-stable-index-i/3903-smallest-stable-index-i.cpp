class Solution {
public:
    int firstStableIndex(vector<int>& nums, int k) {
        int n = nums.size(),count = -1;
        for(int i=0;i<n;i++){
            int max_val = nums[0];
            int min_val = nums[i];
            for(int j=1;j<=i;j++)
                max_val = max(max_val,nums[j]);
            for(int j=i+1;j<n;j++)
                min_val = min(min_val,nums[j]);
            if(max_val-min_val<=k){
                count=i;
                break;
            }
        }
        return count;
    }
};