class Solution {
public:
    string result = "";
    bool solve(string &curr,vector<int> &freq,string &target,int i,bool greater){
        if(i==target.size()){
            if(greater){
                result = curr;
                return true;
            }
            return false;
        }
        for(char ch = 'a';ch<='z';ch++){
            if(freq[ch-'a']==0) continue;
            if(!greater&&ch<target[i]) continue;
            curr.push_back(ch);
            freq[ch-'a']--;
            bool isGreater = greater|ch>target[i];
            if(solve(curr,freq,target,i+1,isGreater))
                return true;
            curr.pop_back();
            freq[ch-'a']++;
        }
        return false;
    }
    string lexGreaterPermutation(string s, string target) {
        int i = 0;
        vector<int> freq(26,0);
        for(char c:s)
            freq[c-'a']++;
        string ans = "";
        solve(ans,freq,target,0,false);
        return result;
    }
};