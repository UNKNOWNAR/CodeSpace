class Solution {
public:
    int largestInteger(vector<int>& nums, int k) {
        int n = nums.size();
        map<int,int> freq;
        for(int i=0;i<=n-k;i++){
            unordered_set<int> seen;
            for(int j=i;j<i+k;j++)
                seen.insert(nums[j]);
            for(int val:seen)
                freq[val]++;
        }
        int min_val = -1;
        for(auto [num,frq]:freq){
            if(frq==1&&num>min_val)
                min_val = num;
        }
        return min_val;
    }
};