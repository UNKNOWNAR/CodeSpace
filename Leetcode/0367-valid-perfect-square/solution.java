class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        long low = 0;
        long high = num;
        while(low<=high){
            long mid = low+(high-low)/2;
            if(mid*mid==num)    return true;
            if(mid*mid<num) low  = mid+1;
            else    high = mid-1;
        }
        return false;
    }
}
