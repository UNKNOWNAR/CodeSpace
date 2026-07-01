class Solution {
public:
    bool consecutiveSetBits(int n) {
        int pairCount = 0;
        unsigned int u_n = n;
        bool flag = false;
        for (int i = 0; i < 32 && u_n != 0; i++) {
            if((u_n&1)==1){
                if(flag)
                    pairCount++;
                flag = true;
            }
            else
                flag = false;
            u_n = u_n>>1;
        }
        return pairCount==1;
    }
};
