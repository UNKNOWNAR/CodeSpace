class Solution {
public:
    int mirrorDistance(int n) {
        int temp = n;
        long reverse = 0;
        while(temp!=0){
            reverse = temp%10+reverse*10;
            temp/=10;
        }
        return abs(n-reverse);
    }
};
