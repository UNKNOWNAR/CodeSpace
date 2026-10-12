class Solution {
public:
    vector<int> maxProductPair(vector<int>& nums, int target) {
        vector<int> ans = {-1,-1};
        int n = nums.size(),mx = -INT_MAX;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target&&nums[i]!=nums[j]){
                    int p = nums[i]*nums[j];
                    if(p>mx){
                        mx = p;
                        if(nums[i]<nums[j])
                            ans = {j,i};
                        else
                            ans = {i,j};
                    }
                }
            }
        }
        return ans;
    }
};