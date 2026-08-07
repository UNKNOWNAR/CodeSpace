class Solution {
    using ll = long long;
public:
    ll subArrayRanges(vector<int>& arr) {
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
        vector<int> nge(n);//next Smaller Element
        vector<int> pgee(n);//previous smaller equal element
        s = stack<int>();
        for(int i=n-1;i>=0;i--){
            while(!s.empty()&&arr[s.top()]<=arr[i])
                s.pop();
            nge[i] = s.empty()?n:s.top();
            s.push(i);
        }
        st = stack<int>();
        for(int i=0;i<n;i++){
            while(!st.empty()&&arr[st.top()]<arr[i])
                st.pop();
            pgee[i] = st.empty()?-1:st.top();
            st.push(i);
        }
        ll smallest_values = 0,greatest_values = 0;
        for(int i=0;i<n;i++){
            int left = i-psee[i];
            int right = nse[i]-i;
            smallest_values = smallest_values + (1LL*left*right*arr[i]);
            left = i-pgee[i];
            right = nge[i]-i;
            greatest_values = greatest_values + (1LL*left*right*arr[i]);
        }
        return greatest_values - smallest_values;
    }
};