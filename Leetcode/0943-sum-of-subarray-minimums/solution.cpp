class Solution {
    using ll = long long;
public:
    int sumSubarrayMins(vector<int>& arr) {
        int mod = 1e9+7;
        ll ans = 0;
        int n = arr.size();
        vector<int> L(n),R(n);
        R[n-1] = n;
        stack<int> s;
        s.push(-1);
        for(int i=0;i<n;i++){
            while(s.top()!=-1&&arr[s.top()]>arr[i])
                s.pop();
            L[i] = s.top();
            s.push(i);
        }
        stack<int> s1;
        s1.push(n);
        for(int i=n-1;i>=0;i--){
            while(s1.top()!=n&&arr[s1.top()]>=arr[i])
                s1.pop();
            R[i] = s1.top();
            s1.push(i);
        }
        for(int i=0;i<n;i++)
            ans += 1LL*(i-L[i])*(R[i]-i)*arr[i];
        return (int)(ans%mod);
    }
};
