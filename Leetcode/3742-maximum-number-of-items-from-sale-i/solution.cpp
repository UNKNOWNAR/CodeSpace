class Solution {
    int minPrice,n;
    vector<vector<int>> memo;
public:
    int solve(int indx,vector<pair<int,int>> &arr,int budget){
        if(indx==n)
            return budget/minPrice;
        if (memo[indx][budget] != -1)
            return memo[indx][budget];
        int take = 0;
        if(arr[indx].second<=budget)
            take = 1+arr[indx].first+solve(indx+1,arr,budget-arr[indx].second);
        int notTake = solve(indx+1,arr,budget);
        return memo[indx][budget] = max(take,notTake);
    }
    int maximumSaleItems(vector<vector<int>>& items, int budget) {
        int copies = 0;
        n = items.size();
        minPrice = 1e9;
        vector<pair<int,int>> arr(n);
        memo.assign(n, vector<int>(budget + 1, -1));
        for(int i=0;i<n;i++){
            int factor = items[i][0];
            int price = items[i][1];
            minPrice = min(minPrice,price);
            int count = 0;
            for(int j=0;j<n;j++){
                int factor2 = items[j][0];
                if(i!=j&&factor2%factor==0)
                    count++;
            }
            arr[i].first = count;
            arr[i].second = price;
        }
        return solve(0,arr,budget);
    }
};
