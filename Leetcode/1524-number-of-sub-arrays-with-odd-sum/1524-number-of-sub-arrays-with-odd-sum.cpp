class Solution {
public:
    int mod = 1e9+7;
    int numOfSubarrays(vector<int>& arr) {
        int evenSumCount = 0, oddSumCount = 0, n = arr.size(),sum = 0,count = 0;
        for(int i=0;i<n;i++){
           if(arr[i]&1){
                swap(oddSumCount, evenSumCount);
                oddSumCount++;
            }
            else
                evenSumCount++; 
           count = (count+oddSumCount)%mod;
        }
        return count;
    }
};