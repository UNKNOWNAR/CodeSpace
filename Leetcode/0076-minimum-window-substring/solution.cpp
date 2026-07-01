class Solution {
public:
    string minWindow(string s, string t) {
        int n = s.size();
        int l = 0,r = 0,minLen = n+1,count = 0,sIndx = 0;
        map<char,int> freq;
        for(auto &c:t)
            freq[c]++;
        count = freq.size();
        while(r<n){
            if(freq.contains(s[r])){
                freq[s[r]]--;
                if(freq[s[r]]==0)
                    count--;
            }
            while(count==0){
                if(freq.contains(s[l])){
                    freq[s[l]]++;
                    if(freq[s[l]]>0)
                        count++;
                }
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    sIndx = l;
                }
                l++;
            }
            r++;
        } 
        return minLen == n + 1 ? "" : s.substr(sIndx, minLen);
    }
};
