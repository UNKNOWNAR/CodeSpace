class Solution {
    using ll = long long;
public:
    ll sumAndMultiply(int n) {
        int temp = n;
        int count = 0;
        int sum = 0;
        ll num = 0;
        while(temp!=0){
            sum += temp %10;
            if(temp%10!=0)
                num += (temp%10)*pow(10,count++);
            temp /= 10;
        }
        return 1LL*num*sum;
    }
};