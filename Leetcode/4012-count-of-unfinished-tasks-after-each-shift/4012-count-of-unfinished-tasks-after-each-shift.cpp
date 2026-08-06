class Solution {
    using ll = long long;
public:
    vector<int> countTasks(vector<int>& tasks, vector<int>& shifts) {
        int t = tasks.size(),s = shifts.size();
        vector<ll> prefixSum(t);
        vector<ll> shift;
        for(int x:shifts)
            shift.push_back(x);
        prefixSum[0] = tasks[0];
        for(int i=1;i<t;i++)
            prefixSum[i] = tasks[i]+prefixSum[i-1];
        vector<int> ans(s);
        ll indx = 0,carry = 0;
        for(int i=0;i<s;i++){
            int indx = upper_bound(prefixSum.begin(),prefixSum.end(),shift[i])-prefixSum.begin();
            ans[i] = t-indx;
            if(indx!=t&&i!=s-1)
                shift[i+1] += shift[i];
        }
        return ans;
    }
};