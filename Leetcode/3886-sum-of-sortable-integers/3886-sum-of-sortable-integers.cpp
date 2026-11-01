class Solution {
public:
    bool isrorationPossible(vector<int>& v1,vector<int>& v2){
        int siz = v1.size();
        for(int i=0;i<siz;i++)
            v2.push_back(v2[i]);
        return search(v2.begin(), v2.end(), v1.begin(), v1.end()) != v2.end();
        
    }
    int sortableIntegers(vector<int>& nums) {
        int n = nums.size(),sum = 0;
        vector<int> sorted = nums;
        sort(sorted.begin(),sorted.end());
        vector<int> divisors;
        for(int k = 1; k * k <= n; k++) {
            if(n % k == 0) {
                divisors.push_back(k);
                if(k * k != n) {
                    divisors.push_back(n / k);
                }
            }
        }
        for(int k : divisors) {
            bool validK = true;
            for(int start=0;start<n;start+=k){
                vector<int> v1(nums.begin()+start,nums.begin()+start+k);
                vector<int> v2(sorted.begin()+start,sorted.begin()+start+k);
                if(!isrorationPossible(v1,v2)){
                    validK = false;
                    break;
                }
            }
            if(validK)
                sum += k;
        }
        return sum;
    }
};