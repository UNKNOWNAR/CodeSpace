class Solution {
    using ll = long long;
public:
    int maxValue(int n, int index, int maxSum) {
        ll low = 1;
        ll high = maxSum;
        while(low <= high){
            ll mid = low + (high-low)/2;
            if(check(mid,n,index,maxSum))
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }
    bool check(ll x,int n,int index,int maxSum){
        ll left = index;
        ll right = n-index-1;
        ll leftSum;
        if(x > left)
            leftSum = left*x - left*(left+1)/2;
        else{
            ll dec = x-1;
            leftSum = dec*(dec+1)/2;
            leftSum += left-dec;
        }
        ll rightSum;
        if(x > right){
            rightSum = right*x - right*(right+1)/2;
        }else{
            ll dec = x-1;
            rightSum = dec*(dec+1)/2;
            rightSum += right-dec;
        }
        return leftSum + rightSum + x <= maxSum;
    }
};