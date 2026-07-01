class Solution {
    using ll = long long;
public:
    bool checkGoodInteger(int n) {
        int temp = n;
        ll diff = 0;
        while(temp>0){
            int d = temp%10;
            diff += d*d-d;
            temp /= 10;
        }
    return diff>=50;
    }
};
