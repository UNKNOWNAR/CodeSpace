class Solution {
public:
    vector<int> limitOccurrences(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> ans;
        map<int,int> freqMap;
        for(int num:nums){
            freqMap[num]++;
        }
        for(auto &it:freqMap){
            int freq = min(k,it.second);
            int val = it.first;
            while(freq--)
                ans.push_back(val);
        }
        return ans;
    }
};
