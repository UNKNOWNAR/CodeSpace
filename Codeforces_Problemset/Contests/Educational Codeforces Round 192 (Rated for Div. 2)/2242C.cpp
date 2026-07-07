#include <bits/stdc++.h>
using namespace std;

#define fast_io ios::sync_with_stdio(false); cin.tie(nullptr);

void solve() {
    int n, k;
    cin >> n >> k;
    vector<int> a(n);
    for (int i = 0; i < n; i++) cin >> a[i];
    vector<int> cnt;
    int cur = 1;
    for (int i = 1; i < n; i++) {
        if (a[i] == a[i - 1]) cur++;
        else {
            cnt.push_back(cur);
            cur = 1;
        }
    }
    cnt.push_back(cur);
    map<int, int> freq;
    long long sumLen = 0;
    for (int x : cnt) {
        freq[x]++;
        sumLen += x;
    }
    int alive = cnt.size();
    long long aliveSum = sumLen;
    int startL = 0;
    int ans = 0;
    for (auto [v, f] : freq) {
        int endL = v - 1;
        if (alive > 0 && startL <= endL) {
            long long need = (long long)k - aliveSum;
            if (need % alive == 0) {
                long long d = need / alive;
                if (max(startL, (int)(-d)) <= endL)
                    ans++;
            }
        }
        alive -= f;
        aliveSum -= 1LL * f * v;
        startL = v;
    }
    cout << ans <<endl;
}
int main() {
    fast_io
    int t;
    cin >> t;
    while (t--) solve();
    return 0;
}