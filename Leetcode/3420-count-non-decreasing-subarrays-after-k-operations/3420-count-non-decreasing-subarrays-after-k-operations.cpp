class Solution {
    using ll = long long;
public:
    ll countNonDecreasingSubarrays(vector<int>& nums, int k) {
        int n = nums.size();
        vector<ll> cumSum(n);
        cumSum[0] = nums[0];
        for(int i=1;i<n;i++)
            cumSum[i] = nums[i]+cumSum[i-1];
        auto rangeSum = [&](int i,int j) -> ll{
            if(i>j) return 0;
            return cumSum[j] - ((i>0)?cumSum[i-1]:0);
        };
        vector<int> NGR(n,n);
        stack<int> st;
        for(int i=0;i<n;i++){
            while(!st.empty() && nums[st.top()] < nums[i]){
                NGR[st.top()] = i;
                st.pop();
            }
            st.push(i);
        }
        vector<ll> ops(n+1,0);
        for(int i=n-1;i>=0;i--){
            int m = NGR[i];
            ll segSum = (1LL*nums[i]*(m-i))-rangeSum(i,m-1);
            ops[i] = segSum + ops[m];
        }
        deque<int> dq;
        ll res = 0;
        int i = 0;
        for(int j=0;j<n;j++){
            while(!dq.empty() && nums[dq.back()]<nums[j])
                dq.pop_back();
            dq.push_back(j);
            while(i<=j){
                int m = dq.front();
                ll opsCount = (ops[i] - ops[m])+(1LL*nums[m]*(j-m+1)) - rangeSum(m,j);
                if(opsCount<=k)
                    break;
                i++;
                if(dq.front()<i)
                    dq.pop_front();
            }
            res += (j-i+1);
        }
        return res;
    }
};