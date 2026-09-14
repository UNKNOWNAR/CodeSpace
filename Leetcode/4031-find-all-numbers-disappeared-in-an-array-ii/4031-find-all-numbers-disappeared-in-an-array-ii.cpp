class Solution {
public:
    vector<vector<int>> findDisappearedNumbers(vector<int>& nums, int lower, int upper) {
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        for(int num:nums){
            if(num<lower)
                continue;
            else if(num==lower){
                lower = num+1;
                continue;
            }
            if(num>lower&&upper>=lower){
                ans.push_back({lower,min(upper,num-1)});
                lower = num+1;
            }
            if(num>upper)
                break;
        }
        if(upper>=lower)
            ans.push_back({lower,upper});
        return ans;
    }
};