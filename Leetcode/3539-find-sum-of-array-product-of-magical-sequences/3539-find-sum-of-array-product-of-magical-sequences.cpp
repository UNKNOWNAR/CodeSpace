class Solution {
public:
    using ll = long long;
    const int mod = 1e9+7;
    int N;
    vector<ll> factorial;
    int dp[31][31][31][51];
    bool isInitialized = false;
    Solution() {
        factorial.assign(51,1);
        precompute();
    }
    void precompute(){
        if(isInitialized)
            return;
        for(int i=2;i<=50;i++)
            factorial[i] = (1LL*factorial[i-1]*i)%mod;
        isInitialized = true;
    }
    ll pow(ll base,ll exp){
        if(!exp)
            return 1;
        ll res = pow(base,exp>>1);
        res = (res*res)%mod;
        if(exp&1)
            res = (res*base)%mod;
        return res;
    }
    ll nCr(ll n,ll r){
        if(r<0||r>n)    return 0;
        ll num = factorial[n]%mod;
        ll den = (factorial[r]*factorial[n-r])%mod;
        return (num*pow(den,mod-2))%mod;
    }
    ll solve(ll carry,int m,int k,int indx,vector<int>& nums){
        if((!m)&&(__builtin_popcountll(carry)==k))
            return 1;
        if((!m)||indx>=N)
            return 0;
        if(k < 0)
            return 0;
        if(dp[carry][m][k][indx]!=-1)
            return dp[carry][m][k][indx];
        ll totalSum = solve(carry>>1,m,k-(carry&1),indx+1,nums);//skip
        ll product = 1;
        for(int freq=1;freq<=m;freq++){//take for freq num of sums
            ll newSum = carry+freq;
            product = (product*nums[indx])%mod;
            ll prod = (1LL*product*solve(newSum>>1,m-freq,k-(newSum&1),indx+1,nums))%mod;
            prod = (prod*nCr(m,freq));
            totalSum = (totalSum+prod)%mod;
        }
        return dp[carry][m][k][indx] = totalSum;
    }
    int magicalSum(int m, int k, vector<int>& nums) {
        N = nums.size();
        memset(dp, -1, sizeof(dp));
        return (int)(solve(0,m,k,0,nums)%mod);
    }
};