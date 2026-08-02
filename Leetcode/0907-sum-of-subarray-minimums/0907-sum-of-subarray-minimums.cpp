class Solution {
    using ll = long long;
public:
    int sumSubarrayMins(vector<int>& arr) {
        int n = arr.size();
        vector<int> nse(n);//next Smaller Element
        vector<int> psee(n);//previous smaller equal element
        stack<int> s;
        for(int i=n-1;i>=0;i--){
            while(!s.empty()&&arr[s.top()]>=arr[i])
                s.pop();
            nse[i] = s.empty()?n:s.top();
            s.push(i);
        }
        stack<int> st;
        for(int i=0;i<n;i++){
            while(!st.empty()&&arr[st.top()]>arr[i])
                st.pop();
            psee[i] = st.empty()?-1:st.top();
            st.push(i);
        }
        int mod = 1e9+7;
        ll total = 0;
        for(int i=0;i<n;i++){
            int left = i-psee[i];
            int right = nse[i]-i;
            total = (total + (1LL*left*right*arr[i])%mod)%mod;
        }
        return total;
    }
};