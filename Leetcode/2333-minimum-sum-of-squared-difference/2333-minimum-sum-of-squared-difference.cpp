class Solution {
    using ll = long long;
public:
    ll minSumSquareDiff(vector<int>& nums1, vector<int>& nums2, int k1, int k2) {
        int n = nums1.size();
        map<ll,ll> freq;
        priority_queue<ll> pq;
        for(int i=0;i<n;i++){
            int diff = abs(nums1[i]-nums2[i]);
            if(!freq.contains(diff))
                pq.push(diff);
            freq[diff]++;
        }
        ll k = k1+k2;
        while(k>0){
            ll num = pq.top();
            pq.pop();
            if(!num)
                break;
            if(!freq.contains(num-1))
                pq.push(num-1);
            int ops = min(k,freq[num]);
            freq[num-1] += ops;
            freq[num] -= ops;
            if(freq[num])
                pq.push(num);
            k-=ops;
        }
        ll ans = 0;
        while(!pq.empty()){
            ans += 1LL*pow(pq.top(),2)*freq[pq.top()];
            pq.pop();
        }
        return ans;
    }
};