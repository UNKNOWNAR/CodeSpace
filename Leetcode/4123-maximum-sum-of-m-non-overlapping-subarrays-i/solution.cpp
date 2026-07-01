class Solution {
    using ll = long long;
public:
    ll maximumSum(vector<int>& nums, int m, int l, int r) {
        int n = nums.size();
        
        // 1. Prefix Sums for O(1) subarray calculations
        vector<ll> pref(n + 1, 0);
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + nums[i];
        }

        const ll MIN_INF = -1e18;
        
        // dp[i][j] = Max sum from the first 'i' elements using exactly 'j' subarrays
        vector<vector<ll>> dp(n + 1, vector<ll>(m + 1, MIN_INF));

        // Base case: 0 elements, 0 subarrays = 0 sum
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        // 2. Iterate over the number of subarrays we want to build
        for (int j = 1; j <= m; j++) {
            
            // The Deque stores indices 'k' of the prefix array.
            // It maintains the maximum value of (dp[k][j-1] - pref[k])
            // for our valid sliding window of lengths between 'l' and 'r'.
            deque<int> dq;

            for (int i = 1; i <= n; i++) {
                
                // A. Add the newest valid starting point to the deque
                // A valid subarray ending at 'i' must have started at least 'l' steps ago
                int new_k = i - l;
                if (new_k >= 0 && dp[new_k][j - 1] != MIN_INF) {
                    ll new_val = dp[new_k][j - 1] - pref[new_k];
                    
                    // Maintain monotonic property (keep max at the front)
                    while (!dq.empty() && (dp[dq.back()][j - 1] - pref[dq.back()]) <= new_val) {
                        dq.pop_back();
                    }
                    dq.push_back(new_k);
                }

                // B. Remove starting points that are now too far away (length > r)
                while (!dq.empty() && dq.front() < i - r) {
                    dq.pop_front();
                }

                // C. Make the same Choice 1 & Choice 2 as your Top-Down logic!
                
                // Choice 1: Skip the current element
                dp[i][j] = dp[i - 1][j]; 
                
                // Choice 2: End a subarray here, using the absolute best starting point from our Deque
                if (!dq.empty()) {
                    int best_k = dq.front();
                    ll max_subarray_combo = pref[i] + dp[best_k][j - 1] - pref[best_k];
                    dp[i][j] = max(dp[i][j], max_subarray_combo);
                }
            }
        }

        // 3. Find the maximum sum using at most 'm' subarrays
        ll maxSum = MIN_INF;
        for (int j = 1; j <= m; j++) {
            maxSum = max(maxSum, dp[n][j]);
        }

        return maxSum;
    }
};
