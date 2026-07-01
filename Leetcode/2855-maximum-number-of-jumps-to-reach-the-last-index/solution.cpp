class Solution {
public:
    int memo[1001];
    int maximumJumps(vector<int>& nums, int target) {
        fill(begin(memo),end(memo), -2);
        return solve(nums,target,0);
    }
    int solve(vector<int>& nums, int target,int indx){
        if (indx == nums.size() - 1) return 0;
        if (memo[indx] != -2) return memo[indx];
        int steps = -1;
        for(int j= indx+1;j<nums.size();j++){
            if(abs(nums[indx]-nums[j])<=target){
                int val = solve(nums,target,j);
                if(val!=-1)
                    steps = max(1+val,steps);
            }
        }
        return memo[indx] = steps;
    }
};
