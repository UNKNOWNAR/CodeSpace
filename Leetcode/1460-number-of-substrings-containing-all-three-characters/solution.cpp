class Solution {
public:
    int numberOfSubstrings(string s) {
        int n = s.size(),l=0,r=0,count=0,distinct=0;
        int freq[3] = {0};
        while(r<n){
            if (freq[s[r] - 'a'] == 0) distinct++;
            freq[s[r]-'a']++;
            while(distinct==3){
                count+=n-r;
                freq[s[l]-'a']--;
                if (freq[s[l] - 'a'] == 0) distinct--;
                l++;
            }
            r++;
        }
        return count;
    }
};
