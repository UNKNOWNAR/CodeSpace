#include <vector>
#include <string>
#include <unordered_map>
#include <algorithm>

using namespace std;

class DSU {
public:
    vector<int> parent;
    DSU(int n) {
        parent.resize(n);
        for (int i = 0; i < n; ++i) {
            parent[i] = i;
        }
    }
    int find(int i) {
        if (parent[i] == i)
            return i;
        return parent[i] = find(parent[i]);
    }
    void union_sets(int i, int j) {
        int root_i = find(i);
        int root_j = find(j);
        if (root_i != root_j) {
            parent[root_i] = root_j;
        }
    }
};
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        int n = strs.size();
        if (n == 0) return {};

        DSU dsu(n);
        unordered_map<string, int> sig_to_first_idx;
        for (int i = 0; i < n; ++i) {
            string key = strs[i];
            sort(key.begin(), key.end());
            if (sig_to_first_idx.contains(key)) {
                dsu.union_sets(i, sig_to_first_idx[key]);
            } else {
                sig_to_first_idx[key] = i;
            }
        }
        unordered_map<int, vector<string>> root_groups;
        for (int i = 0; i < n; ++i) {
            int root = dsu.find(i);
            root_groups[root].push_back(strs[i]);
        }
        vector<vector<string>> result;
        result.reserve(root_groups.size());
        for (auto& [root, group] : root_groups) {
            result.push_back(move(group));
        }
        return result;
    }
};