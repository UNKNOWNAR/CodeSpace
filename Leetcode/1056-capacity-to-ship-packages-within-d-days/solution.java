class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int weight:weights){
            high += weight;
            low = Math.max(low,weight);
        }
        while(low<=high){
            int mid = (low+high)>>1;
            if(check(weights,mid)<=days)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
    public int check(int[] weights,int capacity){
        int days=0;
        int sum = 0;
        for(int weight:weights){
            if(weight+sum<=capacity)
                sum+=weight;
            else{
                sum=weight;
                days++;
            }
        }
        return days+1;
    }
}
