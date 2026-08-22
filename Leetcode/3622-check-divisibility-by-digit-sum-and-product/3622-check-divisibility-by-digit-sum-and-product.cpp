class Solution {
public:
    using ll = long long;
    bool checkDivisibility(ll n) {
        ll sum = 0,product = 1;
        ll temp = n;
        while(temp!=0){
            sum += temp%10;
            product *= (temp%10);
            temp /= 10;
        }
        return n%(sum+product)==0;
    }
};