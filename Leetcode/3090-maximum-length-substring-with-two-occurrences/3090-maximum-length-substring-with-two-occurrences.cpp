class Solution {
public:
    int maximumLengthSubstring(string s) {
        char freq[26] = {0};
        int n = s.size(),l = 0,maxlen = 0;
        for(int r=0;r<n;r++){
            freq[s[r]-'a']++;
            while(freq[s[r]-'a']>2){
                freq[s[l]-'a']--;
                l++;
            }
            maxlen = max(maxlen,r-l+1);
        }
        return maxlen;
    }
};