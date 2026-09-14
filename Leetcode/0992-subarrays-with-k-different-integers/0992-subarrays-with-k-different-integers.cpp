class Solution {
public:
    int solve(vector<int>& nums, int k){
        if (k <= 0) return 0;
        map<int,int> freq;
        int l = 0,count = 0;
        for(int r=0;r<nums.size();r++){
            freq[nums[r]]++;
            while(freq.size()>k){
                freq[nums[l]]--;
                if(freq[nums[l]]==0)
                    freq.erase(nums[l]);
                l++;
            }
            count+=(r-l+1);
        }
        return count;
    }
    int subarraysWithKDistinct(vector<int>& nums, int k) {
        return solve(nums,k)-solve(nums,k-1);
    }
};