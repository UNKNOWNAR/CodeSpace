class Solution {
public:
    int smallestRepunitDivByK(int k) {
        int count = 1;
        int rem = 1;
        set<int> isPresent;
        while(!isPresent.contains(rem%k)){
            if(rem%k==0)
                return count;
            isPresent.insert(rem%k);
            rem = rem*10+1;
            rem = rem%k;
            count++;
        }
        return -1;
    }
};