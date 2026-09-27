class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int l = 0,ans = 0,n = s.size();
        map<int,int> mp;
        for(int r=0;r<n;r++){
            mp[s[r]]++;
            while(mp[s[r]]>1){
                mp[s[l]]--;
                l++;
            }
            if(mp[s[r]]==1)
                ans = max(ans,r-l+1);
        }
        return ans;
    }
};