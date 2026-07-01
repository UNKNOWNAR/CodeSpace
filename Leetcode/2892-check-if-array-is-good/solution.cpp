class Solution {
public:
    bool isGood(vector<int>& nums) {
        if(nums.size()==1)
            return false;
        int n = nums.size()-1;
        unordered_map<int,int> freq;
        for(int num:nums)
            freq[num]++;
        for(int i=1;i<n;i++){
            if(freq[i]!=1)
                return false;
        }
        if(freq[n]==2)
            return true;
        return false;
    }
};
