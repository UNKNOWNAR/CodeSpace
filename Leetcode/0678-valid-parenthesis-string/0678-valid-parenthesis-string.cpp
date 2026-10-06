class Solution {
public:
    int dp[101][101];
    bool checkValidString(string s) {
        memset(dp,-1,sizeof(dp));
        return solve(0,0,s);        
    }
    bool solve(int i,int open,string &s){
        if(i==s.size())
            return !open;
        if(dp[i][open]!=-1)
            return dp[i][open];
        bool isValid = false;
        if(s[i]=='(')
            isValid |= solve(i+1,open+1,s);
        else if(s[i]==')'){
            if(open>0)
                isValid |= solve(i+1,open-1,s);
        }
        else{
            isValid |= solve(i+1,open+1,s);
            isValid |= solve(i+1,open,s);
            if(open>0)
                isValid |= solve(i+1,open-1,s);
        } 
        return dp[i][open] = isValid;
    }
};