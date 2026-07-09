class Solution {
public:
    vector<int> sumAndMultiply(string s, vector<vector<int>>& queries) {
        int n = s.size();
        int mod = 1e9+7;
        vector<pair<int,int>> number(n);
        number[0].first = (int)(s[0]-'0');
        if(s[0]!='0')
            number[0].second = 1;
        for(int i=1;i<n;i++){
            if(s[i]=='0'){
                number[i].first = number[i-1].first;
                number[i].second = number[i-1].second;
                continue;
            }
            number[i].first = (1LL*number[i-1].first*10+(int)(s[i]-'0'))%mod;
            number[i].second = number[i-1].second+1;
        }

        vector<int> digitSum(n);
        digitSum[0] = (int)(s[0]-'0');
        for(int i=1;i<n;i++)
            digitSum[i] = (int)(s[i]-'0')+digitSum[i-1];

        vector<int> pow10(n);
        pow10[0] = 1;
        for(int i=1;i<n;i++)
            pow10[i]=(1LL*pow10[i-1]*10)%mod;

        vector<int> ans;
        for(auto &q:queries){
            int l = q[0];
            int r = q[1];
            int sum = digitSum[r] - (l==0?0:digitSum[l-1]);
            long long x = number[r].first;
            if(l){
                x = (x - 1LL * number[l-1].first *
                        pow10[number[r].second-number[l-1].second]) % mod;
            }
            x = (x + mod) % mod;
            ans.push_back(1LL * x * sum % mod);
        }
        return ans;
    }
};