class Solution {
private:
    void permute(string s,int indx,vector<string>& ans){
        for(int i=indx;i<s.size();i++){
            if(isalpha(s[i])){
                s[i] ^= 32;
                ans.push_back(s);
                permute(s,i+1,ans);
                s[i] ^= 32;
            }
        }
    }
public:
    vector<string> letterCasePermutation(string s) {
        vector<string> ans;
        ans.push_back(s);
        permute(s,0,ans);
        return ans;
    }
};
