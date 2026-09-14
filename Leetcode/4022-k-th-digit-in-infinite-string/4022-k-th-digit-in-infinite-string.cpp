class Solution {
    using ll = long long;
public:
    int kthDigit(ll k) {
        if(k<10)
            return k;
        k-=10;
        ll b = 1;
        int digits = 2;
        ll end = 9;
        ll block_nums = 180;
        ll start = 1;
        while(k>=block_nums){
            k -= block_nums;
            digits++;
            start = start*10;
            end = end*10*1LL+9;
            block_nums = 9LL*digits*pow(10,digits-1);
        }
        b = start + k/(10*digits);
        ll temp = k%(10*digits);
        ll num = 10*b*1LL;
        ll add = temp/digits;
        if(b%2==0)
            num += add;
        else
            num += 9-add;
        ll target = temp%digits;
        char c = to_string(num)[target];
        return c-'0';
    }
};