class Solution {
public:
    vector<int> countServers(int n, vector<vector<int>>& logs, int x, vector<int>& queries) {
        int q = queries.size();
        auto lambda = [](vector<int>& vec1,vector<int>& vec2){
            return vec1[1]<vec2[1];
        };
        vector<vector<int>> modifyQ;
        for(int i=0;i<q;i++)
            modifyQ.push_back({queries[i],i});
        sort(modifyQ.begin(),modifyQ.end());
        sort(logs.begin(),logs.end(),lambda);
        vector<int> ans(q);
        unordered_map<int,int> cnt;
        int i=0,j=0;
        for(auto y:modifyQ){
            int start = y[0]-x;
            int end = y[0];
            while(j<logs.size() && logs[j][1]<=end){
                cnt[logs[j][0]]++;
                j++;
            }
            while(i<logs.size() && logs[i][1]<start){
                cnt[logs[i][0]]--;
                if(!cnt[logs[i][0]])
                    cnt.erase(logs[i][0]);
                i++;
            }
            ans[y[1]] = n-cnt.size();
        }
        return ans;
    }
};