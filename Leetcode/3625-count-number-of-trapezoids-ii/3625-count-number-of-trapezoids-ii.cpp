class Solution {
public:
    const int INF = 1e9+7;
    using ll = long long;
    int countTrapezoids(vector<vector<int>>& points) {
        int n = points.size();
        unordered_map<float,vector<float>> slopeIntercepts;
        unordered_map<ll,vector<float>> midPoints;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];
                float dx = x1-x2;
                float dy = y1-y2;
                float m,c;
                if(dx==0){
                    m = INF;
                    c = x1;
                }
                else{
                    m = dy*1.0/dx;
                    c = (y1*dx-dy*x1)*1.0/dx;
                }
                ll key = (x1+x2)*1e4+(y1+y2);
                slopeIntercepts[m].push_back(c);
                midPoints[key].push_back(m);
            }
        }
        ll result = 0;
        for(auto &it:slopeIntercepts){
            if(it.second.size()<2)
                continue;
            map<float,int> mp;
            for(float c:it.second)
                mp[c]++;
            int lines = 0;
            for(auto &it1:mp){
                int count = it1.second;
                result += count*lines;//counting duplicates
                lines += count;
            }
        }
        for (auto &it:midPoints){
            if(it.second.size()<2)
                continue;
            map<float,int> mp;
            for(float m:it.second)
                mp[m]++;
            int lines = 0;
            for(auto &it1:mp){
                int count = it1.second;
                result -= count*lines;//removing duplicates
                lines += count;
            }
        }
        return result;
    }
};