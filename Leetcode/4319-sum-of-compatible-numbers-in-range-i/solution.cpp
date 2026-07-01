class Solution {
public:
    int sumOfGoodIntegers(int n, int k) {
        int x = max(0,n-k);
        int sum = 0;
        while(x<=n+k){
            if((n&x)==0)
                sum +=x ;
            x++;
        }
        return sum;
    }
};
