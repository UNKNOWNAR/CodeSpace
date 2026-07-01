class Solution {
public:
    int longestCommonPrefix(vector<int>& arr1, vector<int>& arr2) {
        unordered_set<int> set;
        for(auto &it:arr1){
            int multiply = static_cast<int>(1e8);
            while(multiply>0){
                if(it>=multiply&&!set.contains(it/multiply))
                    set.insert(it/multiply);
                multiply /= 10;
            }
        }
        int ans = 0;
        for(auto &it:arr2){
            int multiply = static_cast<int>(1e8);
            int len = 0;
            while(multiply>0){
                if(it>=multiply){
                    if(set.contains(it/multiply))
                        len++;
                    else 
                        break;
                }
                multiply /= 10;
                ans = max(ans,len);
            }
        }
        return ans;
    }
};
