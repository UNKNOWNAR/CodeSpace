class Solution {
public:
    using ll = long long;
    vector<ll> prefixSum;
    int n;
    ll sum;
    Solution(vector<int>& w) {
        n = w.size();
        prefixSum.resize(n);
        prefixSum[0] = w[0];
        for(int i=1;i<n;i++)
            prefixSum[i] = prefixSum[i-1]+w[i];
        sum = prefixSum[n-1];
    }
    int pickIndex() {
        int num = rand()%sum;
        int low = 0,high = n-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(prefixSum[mid]>num)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
};

/**
 * Your Solution object will be instantiated and called as such:
 * Solution* obj = new Solution(w);
 * int param_1 = obj->pickIndex();
 */