class Solution {
    using ll = long long;
public:
    int numDecodings(string s) {
        vector<ll> dp(s.size(),-1);
        return count(0,s,dp);
    }
    ll count(int indx,string& s,vector<ll>& dp){
        if(indx>=s.length())
            return 1;
        if(dp[indx]!=-1)
            return dp[indx];
        int num = s[indx]-'0';
        if(num==0)
            return 0;
        ll c = 0;
        if(indx!=s.size()-1){
            num = num*10+(s[indx+1]-'0');
            if(num<=26)
                c = count(indx+2,s,dp);
        }
        if(num%10!=0)
            c += count(indx+1,s,dp);
        return dp[indx] = c;
    }
};