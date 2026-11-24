class Solution {
public:
    int maxLength(vector<int>& nums) {
        int n = nums.size(),max_len = 2;
        for(int i=0;i<n;i++){
            for(int j=i+2;j<n;j++){
                bool flag = true;
                for(int k=i;k<j;k++){
                    for(int l=k+1;l<=j;l++){
                        if(gcd(nums[k],nums[l])!=1){
                            flag = false;
                            break;
                        }
                    }
                    if(!flag)
                        break;
                }
                if(flag)
                    max_len = max(max_len,j-i+1);
            }
        }
        return max_len;
    }
};