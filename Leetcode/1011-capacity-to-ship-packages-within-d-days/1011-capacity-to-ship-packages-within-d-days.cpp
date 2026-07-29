class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        int low = *max_element(weights.begin(),weights.end());
        int high = 0;
        for(int weight:weights)
            high += weight;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(check(mid,weights,days))
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
    bool check(int capacity,vector<int>& weights, int days){
        int count = 1;
        int sum = 0;
        for(int weight:weights){
            if(sum+weight>capacity){
                count++;
                sum = weight;
            }
            else
                sum += weight;
            if(count>days)  return false;
        }
        return true;
    }
};