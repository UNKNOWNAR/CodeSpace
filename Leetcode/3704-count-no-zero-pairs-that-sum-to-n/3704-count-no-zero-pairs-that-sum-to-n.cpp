class Solution {
public:
    using ll = long long;
    ll dp[18][2][2][2][2];
    ll solve(int i,int carry,int started,int finished1,int finished2,string &s){
        if(i==s.size()){
            if((!carry)&&started)//if carry is over and we have started with it
                return 1;
            else
                return 0;
        }
        if(dp[i][carry][started][finished1][finished2]!=-1)
            return dp[i][carry][started][finished1][finished2];
        if(finished1 && finished2)//invalid state
            return 0; 
        ll ans = 0;
        if(carry==s[i]-'0')
            ans += solve(i+1,0,started,1,1,s);
        if(finished1){
            for(int j=1;j<=9;j++){
                int curr = carry+j;
                int c = curr/10;
                curr = curr % 10;
                if(curr==s[i]-'0')
                    ans += solve(i+1,c,1,1,finished2,s);
            }
        }
        if(finished2){
            for(int j=1;j<=9;j++){
                int curr = carry+j;
                int c = curr/10;
                curr = curr % 10;
                if(curr==s[i]-'0')
                    ans += solve(i+1,c,1,finished1,1,s);
            }
        }
        if(!finished1 && !finished2){
            for(int j=1;j<=9;j++){
                for(int k=1;k<=9;k++){
                    int curr = carry+j+k;
                    int c = curr/10;
                    curr = curr % 10;
                    if(curr==s[i]-'0')
                        ans += solve(i+1,c,0,1,finished2,s)+solve(i+1,c,0,finished1,1,s)+solve(i+1,c,started,finished1,finished2,s);
                }
            }
        }
        return dp[i][carry][started][finished1][finished2] = ans;
    }
    ll countNoZeroPairs(ll n) {
        string s = to_string(n);
        reverse(s.begin(),s.end());
        memset(dp,-1,sizeof(dp));
        return solve(0,0,1,0,0,s);
    }
};