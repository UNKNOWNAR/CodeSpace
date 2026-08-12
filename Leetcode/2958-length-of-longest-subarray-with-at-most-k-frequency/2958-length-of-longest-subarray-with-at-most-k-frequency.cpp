class Solution {
public:
    int maxSubarrayLength(vector<int>& nums, int k) {
        unordered_map<int,int> freq;
        int max_size = 1,l = 0,n = nums.size();
        for(int r=0;r<n;r++){
            freq[nums[r]]++;
            while(freq[nums[r]]>k){
                freq[nums[l]]--;
                l++;
            }
            max_size = max(max_size,r-l+1);
        }
        return max_size;
    }
};