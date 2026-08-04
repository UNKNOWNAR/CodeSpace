class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
        int min_val = 1e9,max_val = 0;
        set<int> uniq;
        for(int num:nums){
            uniq.insert(num);
            min_val = min(num,min_val);
            max_val = max(num,max_val);
        }
        vector<int> ans;
        for(int i=min_val;i<=max_val;i++){
            if(!uniq.contains(i))
                ans.push_back(i);
        }
        return ans;
    }
};