#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    int maximumSaleItems(vector<vector<int>>& items, int budget) {
        int n = items.size();
        long long min_price = 2e18; 
        for (const auto& item : items) {
            if (item[1] < min_price) {
                min_price = item[1];
            }
        }
        
        vector<int> count(n, 0);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j && items[j][0] % items[i][0] == 0) {
                    count[i]++;
                }
            }
        }

        struct BItem {
            int w, v;
        };
        vector<BItem> b_items;
        for(int i = 0; i < n; i++) {
            int c = count[i];
            int p = items[i][1];
            if (p >= 2 * minPrice) continue;
            
            int k = 1;
            while(c >= k) {
                b_items.push_back({k * p, k * 2});
                c -= k;
                k *= 2;
            }
            if(c > 0) {
                b_items.push_back({c * p, c * 2});
            }
        }
        
        vector<int> dp(budget + 1, -1);
        dp[0] = 0;
        for(const auto& b : b_items) {
            for(int c = budget; c >= b.w; c--) {
                if(dp[c - b.w] != -1) {
                    dp[c] = max(dp[c], dp[c - b.w] + b.v);
                }
            }
        }
        
        long long max_copies = 0;
        for(int c = 0; c <= budget; c++) {
            if(dp[c] != -1) {
                long long rem = budget - c;
                long long copies = dp[c] + (rem / minPrice);
                max_copies = max(max_copies, copies);
            }
        }

        return max_copies;
    }
};
int main() {
    int n, budget;
    while (cin >> n >> budget) {
        vector<vector<int>> items(n, vector<int>(2));
        for (int i = 0; i < n; ++i) {
            cin >> items[i][0] >> items[i][1];
        }
        Solution sol;
        cout << sol.maximumSaleItems(items, budget) << "\n";
    }
    return 0;
}