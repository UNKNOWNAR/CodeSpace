class Solution {
public:
    int indx = 0;
    string reverseParentheses(string s) {
        return solve(s);
    }
    string solve(string& s){
        string ans = "";
        while(indx<s.size()){
            if(s[indx]=='('){
                indx++;
                ans += solve(s);
            }
            else if(s[indx]==')'){
                indx++;
                reverse(ans.begin(),ans.end());
                break;
            }
            else{
                ans += s[indx];
                indx++;
            }
        }
        return ans;
    }
};