class Solution {
public:
    int longestMonotonicSubarray(vector<int>& arr) {
        int max_len = 0,len = 1;
        for(int i=0;i<arr.size()-1;i++){
            if(arr[i]<arr[i+1])
                len++;
            else{
                max_len = max(max_len,len);
                len=1;
            }
        }
        max_len = max(max_len,len);
        len=1;
        for(int i=0;i<arr.size()-1;i++){
            if(arr[i]>arr[i+1])
                len++;
            else{
                max_len = max(max_len,len);
                len=1;
            }
        }
        max_len = max(max_len,len);
        return max_len;
    }
};