class Solution {
public:
    vector<int> lexicographicallySmallestArray(vector<int>& nums, int limit) {
        int n = nums.size();
        vector<pair<int,int>> arr;
        for(int i=0;i<n;i++)
            arr.push_back({nums[i],i});
        sort(arr.begin(),arr.end());
        int siz=1;
        for(int i=0;i<n-1;i++){
            if(arr[i+1].first-arr[i].first>limit)
                siz++;
        }
        vector<vector<vector<int>>> temp(siz,vector<vector<int>>(2));
        siz = 0;
        temp[siz][0].push_back(arr[0].first);
        temp[siz][1].push_back(arr[0].second);
        for(int i=1;i<n;i++){
            if(arr[i].first-arr[i-1].first>limit)
                siz++;
            temp[siz][0].push_back(arr[i].first);
            temp[siz][1].push_back(arr[i].second);
        }
        for(int i=0;i<=siz;i++)
            sort(temp[i][1].begin(),temp[i][1].end());
        for(int i=0;i<=siz;i++){
            int size = temp[i][0].size();
            for(int j=0;j<size;j++)
                nums[temp[i][1][j]] = temp[i][0][j];
        }
        return nums;
    }
};