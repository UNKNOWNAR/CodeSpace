class Solution {
private:
    void backTrack(vector<vector<int>>& ans,vector<int>& temp,vector<int>& nums,vector<bool>& used,int size){
        if (size == nums.size()) {
            ans.push_back(temp); // add a copy
            return;
        }
        for (int i = 0; i < nums.size(); i++) {
            if(i!=0&&nums[i-1]==nums[i]&&!used[i-1])
                continue;
            if (!used[i]) {
                temp[size] = nums[i];
                used[i] = true;
                backTrack(ans, temp, nums, used, size+1);
                used[i] = false;
            }
        }
    }
public:
    vector<vector<int>> permuteUnique(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> temp(nums.size());
        vector<bool> used(nums.size(),false);
        sort(nums.begin(),nums.end());
        backTrack(ans, temp, nums, used, 0);
        return ans;
    }
};

