class Solution {
public:
    int maxSubarrayLength(vector<int>& nums, int k) {
        unordered_map<int,int> freq;
        int max_size = 1,l = 0,n = nums.size(),violtaions=0;
        for(int r=0;r<n;r++){
            freq[nums[r]]++;
            if(freq[nums[r]]==k+1)
                violtaions++;
            if(violtaions>0){
                if(freq[nums[l]]==k+1)
                    violtaions--;
                freq[nums[l]]--;
                l++;
            }
            max_size = max(max_size,r-l+1);
        }
        return max_size;
    }
};