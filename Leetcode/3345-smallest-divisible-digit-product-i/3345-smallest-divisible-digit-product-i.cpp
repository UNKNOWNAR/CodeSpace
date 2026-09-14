class Solution {
    using ll = long long;
public:
    bool check(int n,int t){
        ll p = 1;
        while(n!=0){
            p*=n%10;
            n/=10;
        }
        return p%t==0;
    }
    int smallestNumber(int n, int t) {
        while(!check(n,t))
            n++;
        return n;
    }
};