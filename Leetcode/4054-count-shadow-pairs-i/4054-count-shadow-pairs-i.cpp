class Solution {
    using ll = long long;
public:
    ll shadowPairs(vector<int>& nums) {
        unordered_map<int, vector<int>> mp;
        int n = nums.size();
        for (int i = 0; i < n; i++) 
            mp[nums[i]].push_back(i);
        vector<int> nse(n,n);
        stack<int> st;
        for(int i=n-1;i>=0;i--){
            while(!st.empty()&&nums[st.top()]>=nums[i])
                st.pop();
            if(!st.empty())
                nse[i] = st.top();
            st.push(i);
        }
        ll count = 0;
        for(int i=0;i<n;i++){
            int y = nse[i];
            if(y==i+1)    continue;
            auto& v = mp[nums[i]];
            auto it1 = upper_bound(v.begin(),v.end(),y);
            auto it2 = lower_bound(v.begin(),v.end(),i);
            ll d = it1-it2-1;
            count += (y-i-1-d);
        }
        return count;
    }
};