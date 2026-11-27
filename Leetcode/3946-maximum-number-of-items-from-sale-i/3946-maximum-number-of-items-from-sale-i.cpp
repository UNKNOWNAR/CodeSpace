class Solution {
public:
    int n;
    int dp[1000][1501][2];
    int solve(int indx,int budget,bool flag,vector<vector<int>>& items,vector<int>& divideCount){
        if(indx==n)
            return 0;
        if(dp[indx][budget][flag]!=-1)
            return dp[indx][budget][flag];
        int count = 1,countItems = 0;
        if(budget>=items[indx][1]){//take
            countItems = max(countItems,1+(!flag?divideCount[indx]:0)+max(solve(indx+1,budget-items[indx][1],false,items,divideCount),solve(indx,budget-items[indx][1],true,items,divideCount)));
            count++;
        }
        countItems = max(countItems,solve(indx+1,budget,false,items,divideCount));//skip
        return dp[indx][budget][flag] = countItems;
    }
    int maximumSaleItems(vector<vector<int>>& items, int budget) {
        n = items.size();
        memset(dp, -1, sizeof(dp));
        vector<int> divideCount(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    continue;
                if(items[j][0]%items[i][0]==0)
                    divideCount[i]++;
            }
        }
        return solve(0,budget,false,items,divideCount);;
    }
};