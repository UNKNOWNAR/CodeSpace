class Solution {
public:
    int maxJumps(vector<int>& arr, int d) {
        int n = arr.size();
        vector<int> dp(n,-1);
        vector<pair<int,int>> vec;
        for(int i=0;i<n;i++)
            vec.push_back({arr[i],i});
        sort(begin(vec),end(vec));
        int result = 1;
        for(auto &it:vec){
            int val = it.first;
            int indx = it.second;
            int ans = 1;
            int left = max(0,indx-d);
            for(int i=indx-1;i>=left;i--){
                if(arr[i]>=arr[indx])
                    break;
                ans = max(ans,1+dp[i]);
            }

            int right = min(n-1,indx+d);
            for(int i=indx+1;i<=right;i++){
                if(arr[i]>=arr[indx])
                    break;
                ans = max(ans,1+dp[i]);
            }
            dp[indx] = ans;
            result = max(result,dp[indx]);
        }
        return result;
    }
};
