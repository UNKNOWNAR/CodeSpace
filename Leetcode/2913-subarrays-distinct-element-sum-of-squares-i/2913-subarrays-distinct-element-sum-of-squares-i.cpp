class Solution {
public:
    int sumCounts(vector<int>& nums) {
        int n = nums.size();
        int ans = 0;
        for(int i=0;i<n;i++){
            set<int> uniq;
            for(int j=i;j<n;j++){
                uniq.insert(nums[j]);
                ans += pow(uniq.size(),2);
            }
        }
        return ans;
    }
};