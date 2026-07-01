class Solution {
public:
    int maxBuilding(int n, vector<vector<int>>& restrictions) {
        restrictions.push_back({1,0});
        restrictions.push_back({n,n-1});
        sort(restrictions.begin(),restrictions.end());
        int N = restrictions.size();

        for(int i=1;i<N;i++){
            int diff = restrictions[i][0]-restrictions[i-1][0];
            restrictions[i][1] = min(restrictions[i][1],restrictions[i-1][1]+diff);
        }
        for(int i=N-2;i>=0;i--){
            int diff = restrictions[i+1][0]-restrictions[i][0];
            restrictions[i][1] = min(restrictions[i][1],restrictions[i+1][1]+diff);
        }

        int result = 0;
        for(int i=1;i<N;i++){
            int leftPos = restrictions[i-1][0];
            int lH = restrictions[i-1][1];

            int rightPos = restrictions[i][0];
            int rH = restrictions[i][1];

            int maxH = max(rH,lH)+(rightPos-leftPos-abs(rH-lH))/2;
            result = max(result,maxH);
        }
        return result;
    }
};
