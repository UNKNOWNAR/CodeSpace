class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        vector<int> freq(26,0);
        for(char c:s1)
            freq[c-'a']++;
        vector<int> match(26,0);
        for(int r=0;r<s2.size();r++){
            match[s2[r]-'a']++;
            if(r>=s1.size()-1){
                if(freq==match)
                    return true;
                match[s2[r+1-s1.size()]-'a']--;
            }
        }
        return false;
    }
};