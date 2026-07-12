class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        vector<pair<int,int>> temp;
        int n = arr.size();
        set<int> s;
        for(int i=0;i<n;i++)
            s.insert(arr[i]);
        map<int,int> indx;
        int rank = 0;
        for(auto &x:s)
            indx[x] = ++rank;
        for(int i=0;i<n;i++)
            arr[i] = indx[arr[i]];
        return arr;
    }
};