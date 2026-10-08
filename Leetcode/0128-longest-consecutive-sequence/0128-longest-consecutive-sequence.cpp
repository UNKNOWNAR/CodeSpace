class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(!nums.size())
            return 0;
        sort(nums.begin(),nums.end());
        int curr_cnt = 1,lastSmaller = -1e9,ans = 1;
        for(int num:nums){
            if(lastSmaller+1==num){
                curr_cnt++;
                ans = max(ans,curr_cnt);
            }
            else if(lastSmaller!=num)
                curr_cnt = 1;
            lastSmaller = num;
        }
        return ans;
    }
};