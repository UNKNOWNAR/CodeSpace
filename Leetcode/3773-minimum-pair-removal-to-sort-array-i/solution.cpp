class Solution {
public:
    int minimumPairRemoval(vector<int>& nums) {
        int ans = 0;
        while(!is_sorted(nums.begin(),nums.end())){
            int minSum = INT_MAX;
            int targetIdx = -1;
            for (int i = 0; i < nums.size() - 1; ++i) {
                int currentSum = nums[i] + nums[i+1];
                if (currentSum < minSum) {
                    minSum = currentSum;
                    targetIdx = i;
                }
            }
            nums[targetIdx] = minSum;
            nums.erase(nums.begin() + targetIdx + 1);
            ans++;
        }
        return ans;
    }
};
