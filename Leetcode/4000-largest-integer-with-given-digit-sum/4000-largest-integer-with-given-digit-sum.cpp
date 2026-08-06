class Solution {
    using ll = long long;
public:
    int largestInteger(int n, int s) {
        ll ans = 0;
        int digit = 0;
        while(s>9){
            ans = ans*10+9;
            s-=9;
            digit++;
        }
        ans = ans*10+s;
        digit++;
        if(digit>n)
            return -1;
        while(digit<n){
            ans *= 10;
            digit++;
        }
        return ans;
    }
};