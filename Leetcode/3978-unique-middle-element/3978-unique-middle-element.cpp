class Solution {
public:
    bool isMiddleElementUnique(vector<int>& nums) {
        int n = nums.size();
        int freq = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==nums[n/2])
                freq++;
            if(freq>=2)
                return false;
        }
        return true;
    }
};