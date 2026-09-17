class Solution {
public:
    struct Interval{
        int size,l,r;
    };
    int minSumOfLengths(vector<int>& arr, int target) {
        vector<Interval> size;
        int l = 0,n = arr.size(),sum = 0;
        for(int r=0;r<n;r++){
            sum += arr[r];
            while(sum>target){
                sum -= arr[l];
                l++;
            }
            if(sum==target){
                size.push_back({r-l+1,l,r});
                sum -= arr[l];
                l++;
            }
        }
        if(size.size()<2)
            return -1;
        int ans = 1e9,min_len = 1e9,j=0;
        for(int i=0;i<size.size();i++){
            while(j<i&&size[j].r<size[i].l){
                min_len = min(min_len,size[j].size);
                j++;
            }
            if(min_len!=1e9)
                ans = min(ans,min_len+size[i].size);
        }
        return ans==1e9?-1:ans;
    }
};