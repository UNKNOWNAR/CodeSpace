class Solution {
public:
    int minSumOfLengths(vector<int>& arr, int target) {
        int l = 0,n = arr.size(),sum = 0,res = 1e9,min_len = 1e9;
        vector<int> minTillIndx(n,1e9);
        for(int r=0;r<n;r++){
            sum += arr[r];
            while(sum>target){
                sum -= arr[l];
                l++;
            }
            if(sum==target){
                int len = r-l+1;
                if(l>0&&minTillIndx[l-1]!=1e9)
                    res = min(res,len+minTillIndx[l-1]);
                min_len = min(min_len,len);
                sum -= arr[l++];
            }
            minTillIndx[r] = min_len;
        }
        return res==1e9?-1:res;
    }
};