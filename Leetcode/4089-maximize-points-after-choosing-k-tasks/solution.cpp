class Solution {
public:
    using ll = long long;
    long long maxPoints(vector<int>& technique1, vector<int>& technique2, int k) {
        int n = technique1.size();
        ll total = 0;
        vector<int> indices(n);
        iota(indices.begin(), indices.end(), 0);
        sort(indices.begin(), indices.end(), [&](int a, int b) {
            return technique1[a] - technique2[a] > technique1[b] - technique2[b];
        });

        for (int i = 0; i < n; ++i) {
            int idx = indices[i];
            if (i < k) 
                total += technique1[idx];
            else
                total += max(technique1[idx], technique2[idx]);
        }

        return total;
    }
};
