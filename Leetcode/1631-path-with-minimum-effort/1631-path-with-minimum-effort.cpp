class Solution {
public:
    bool check(int limit, vector<vector<int>>& heights) {
        int n = heights.size();
        int m = heights[0].size();
        vector<vector<int>> vis(n, vector<int>(m, 0));
        queue<pair<int, int>> q;
        q.push({0, 0});
        vis[0][0] = 1;
        int dr[4] = {1, 0, -1, 0};
        int dc[4] = {0, 1, 0, -1};
        while (!q.empty()) {
            auto [r, c] = q.front();
            q.pop();
            if (r == n - 1 && c == m - 1)
                return true;
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr < 0 || nr >= n || nc < 0 || nc >= m)
                    continue;
                if (vis[nr][nc])
                    continue;
                if (abs(heights[r][c] - heights[nr][nc]) > limit)
                    continue;
                vis[nr][nc] = 1;
                q.push({nr, nc});
            }
        }
        return false;
    }
    int minimumEffortPath(vector<vector<int>>& heights) {
        int low = 0;
        int high = 0;
        for (auto &row : heights) {
            for (int h : row) {
                high = max(high, h);
            }
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(mid, heights)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
};