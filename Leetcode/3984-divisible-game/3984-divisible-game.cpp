class Solution {
public:
using ll = long long;
    const int mod = 1e9+7;
    void getPrimes(set<int> &primes,int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                primes.insert(i);
            while(n%i==0)
                n /= i;
        }
        if (n > 1)
        primes.insert(n);
    }
    ll kadanesAlgo(vector<int> &nums,ll k){
        ll curr_score = 0,max_score = -1e18;
        for(int num:nums){
        if(num%k==0)
                curr_score += num;
            else
                curr_score -= num;
            max_score = max(max_score,curr_score);
            curr_score = max(0LL,curr_score);
        }
        return max_score;
    }
    int divisibleGame(vector<int>& nums) {
        set<int> primes;
        for(int num:nums)
            getPrimes(primes,num);
        if(primes.size()==0)
            primes.insert(2);
        ll score = -1e9,k_best = 0;
        for(int prime:primes){
            ll currScore = kadanesAlgo(nums,prime);
            if(currScore>score){
                k_best = prime;
                score = currScore;
            }
        }
        return ((1LL*(k_best%mod)*(score%mod))+mod)%mod;
    }
};