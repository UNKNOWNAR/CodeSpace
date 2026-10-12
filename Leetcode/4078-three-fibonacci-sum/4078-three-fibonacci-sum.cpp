class Solution {
    using ll = long long;
public:
    bool threeFibonacciSum(int n) {
        if(n&1)
            return false;
        ll a = 0;
        ll b = 1;
        while(b<n/2){
            ll temp = b;
            b += a;
            a = temp;
        }
        return b==n/2;
    }
};