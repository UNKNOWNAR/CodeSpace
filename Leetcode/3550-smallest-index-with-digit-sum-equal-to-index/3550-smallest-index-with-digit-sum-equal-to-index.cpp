class Solution {
public:
    int sum(int n){
        int sum1 = 0;
        while(n>0){
            sum1 += n%10;
            n /= 10;
        }
        return sum1;
    }
    int smallestIndex(vector<int>& nums) {
        int n = nums.size();
        for(int i=0;i<n;i++){
            if(i==sum(nums[i]))
                return i;
        }
        return -1;
    }
};