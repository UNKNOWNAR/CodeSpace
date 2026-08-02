class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> freq(k,0);
        freq[0] = 1;
        int prefix_sum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            prefix_sum += nums[i];
        count += freq[(prefix_sum%k+k)%k];
            freq[(prefix_sum%k+k)%k]++;
        }
        return count;
    }
};