class Solution {
    #define ll long long
public:
    int maximumSaleItems(vector<vector<int>>& items, int budget) {
        int n = items.size();
        ll minPrice = 1e18;
        int maxFactor = 0;
        for(int i=0;i<n;i++){
            int factor = items[i][0];
            ll price = items[i][1];
            minPrice = min(minPrice,price);
            maxFactor = max(maxFactor,factor);
        }
        vector<int> freq(maxFactor+1,0);
        for(int i=0;i<n;i++){
            int factor = items[i][0];
            freq[factor]++;
        }
        vector<int> factors(maxFactor + 1, 0);
        for (int x = 1; x <= maxFactor; ++x) {//)(Mlog(M))
            if (freq[x] > 0){
                int count = 0;
                for (int mul = x; mul <= maxFactor; mul += x) 
                    count += freq[mul];
                factors[x] = count;
            }
        }
        vector<pair<int,int>> deals;
        ll limit = 2LL*minPrice;
        for(int i=0;i<n;i++){
            int factor = items[i][0];
            ll price = items[i][1];
            if(factors[factor]>1&&price<=limit)
                deals.push_back({price,factors[factor]-1});
        }
        sort(deals.begin(), deals.end(), [](const auto& a, const auto& b) {
            return a.first < b.first;
        });
        ll ans = 0;
        ll currBudget = budget;
        for (const auto& deal : deals) {
            if (currBudget < deal.first) break; 
            ll affordable = currBudget / deal.first;
            ll take = min<long long>(affordable, deal.second);
            ans += take * 2; 
            currBudget -= take * deal.first;
        }
        ans += currBudget / minPrice;
        return ans;
    }
};
