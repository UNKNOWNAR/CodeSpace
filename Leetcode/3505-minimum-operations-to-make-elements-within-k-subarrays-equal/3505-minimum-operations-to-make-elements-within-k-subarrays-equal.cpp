class Solution {
    using ll = long long;
public:
    ll minOps[100001];
    ll dp[16][100001];
    int n,x,k;
    ll solve(int count,int i){
        if(count==k)
            return 0;
        int eleNeeded = (k-count)*x;
        int lastIndx = i+eleNeeded-1;
        if(lastIndx>=n)
            return 1e16;
        if(dp[count][i]!=-1)
            return dp[count][i];
        ll res = minOps[i] + solve(count+1,i+x);
        res = min(res,solve(count,i+1));
        return dp[count][i] = res;
    }
    ll minOperations(vector<int>& nums, int x, int k) {
        this->n = nums.size();
        this->x = x;
        this->k = k;
        memset(dp,-1,sizeof(dp));
        multiset<int> left,right;
        ll leftSum = 0,rightSum = 0;
        int i=0,j=0;
        while(j<n){
            if(left.size()<=right.size()){
                left.insert(nums[j]);
                leftSum += nums[j];
            }
            else{
                right.insert(nums[j]);
                rightSum += nums[j];
            }
            if(!left.empty()&&!right.empty()){
                int maxLeft = *left.rbegin();
                int minRight = *right.begin();
                if(maxLeft>minRight){
                    left.erase(left.find(maxLeft));
                    right.erase(right.find(minRight));
                    left.insert(minRight);
                    right.insert(maxLeft);
                    leftSum += minRight-maxLeft;
                    rightSum += maxLeft-minRight;
                }
            }
            if(j-i+1==x){
                ll median = *left.rbegin();
                ll leftSize = left.size();
                ll rightSize = right.size();
                minOps[i] = (leftSize*median-leftSum) +(rightSum-rightSize*median);
                if(left.find(nums[i])!=left.end()){
                    left.erase(left.find(nums[i]));
                    leftSum -= nums[i];
                }
                else{
                    right.erase(right.find(nums[i]));
                    rightSum -= nums[i];
                }
                i++;
            }
            j++;
        }
        return solve(0,0);
    }
};