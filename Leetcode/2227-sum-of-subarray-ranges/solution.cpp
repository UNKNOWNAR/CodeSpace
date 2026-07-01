class Solution {
    using ll = long long;
public:
    ll subArrayRanges(vector<int>& arr) {
        ll ans = 0;
        int n = arr.size();
        vector<int> L(n),R(n);//min
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
            ans -= 1LL*(i-L[i])*(R[i]-i)*arr[i];

        vector<int> L1(n),R1(n);//max
        stack<int> s2;
        s2.push(-1);
        for(int i=0;i<n;i++){
            while(s2.top()!=-1&&arr[s2.top()]<arr[i])
                s2.pop();
            L1[i] = s2.top();
            s2.push(i);
        }
        stack<int> s3;
        s3.push(n);
        for(int i=n-1;i>=0;i--){
            while(s3.top()!=n&&arr[s3.top()]<=arr[i])
                s3.pop();
            R1[i] = s3.top();
            s3.push(i);
        }
        for(int i=0;i<n;i++)
            ans += 1LL*(i-L1[i])*(R1[i]-i)*arr[i];
        return ans;
    }
};

