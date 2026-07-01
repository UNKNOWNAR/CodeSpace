class Solution {
public:
    int minOperations(vector<int>& nums) {
        int n = nums.size();
        vector<int> Dnums(2*n);
        vector<int> Rnums(2*n);
        bool flag = true;
        for(int i=0;i<n;i++){
            if(i!=nums[i]){
                flag = false;
                break;
            }
        }
        if(flag)//already in correct order
            return 0;
        flag = true;
        for(int i=0;i<n;i++){
            if(n-i-1!=nums[i]){
                flag = false;
                break;
            }
        }
        if(flag)//one reverse gives the correct order
            return 1;
        for(int i=0;i<n;i++){
            Dnums[i] = nums[i];
            Dnums[i+n] = nums[i];
            Rnums[i] = nums[n-1-i];
            Rnums[i+n] = nums[n-1-i];
        }
        //some amount of left shift is needed to get in required order
        int indx = 0;
        int start = -1;
        int ans = INT_MAX;
        for(int i=0;i<2*n;i++){
            if(Dnums[i]==indx){
                if(indx==0) start = i;
                indx++;
                if(indx==n){
                    ans = min(ans, start); 
                    break;
                }
            }
            else{
                indx = 0;
                start = -1;
                if(Dnums[i]==0){
                    start = i;
                    indx = 1;
                }
            }
        }
        //reverse it and some amount of left shift is needed to get in required order
        indx = 0;
        start = -1;
        for(int i=0;i<2*n;i++){
            if(Rnums[i]==indx){
                if(indx==0) start = i;
                indx++;
                if(indx==n){
                    ans = min(ans, start+1);//1 reverse is needed here 
                    break;
                }
            }
            else{
                indx = 0;
                start = -1;
                if(Rnums[i]==0){
                    start = i;
                    indx = 1;
                }
            }
        }
        //Left Shifts to form a descending sequence, then Reverse
        indx = n-1;
        start = -1;
        for(int i=0;i<2*n;i++){
            if(Dnums[i]==indx){
                if(indx==n-1) start = i;
                indx--;
                if(indx==-1){
                    ans = min(ans, start+1);//1 reverse is needed here 
                    break;
                }
            }
            else{
                indx = n-1; 
                start = -1;
                if(Dnums[i]==n-1){ 
                    start = i; 
                    indx = n-2; 
                }
            }
        }
        //Reverse, Left Shift to form descending, then Reverse again
        indx = n-1;
        start=-1;
        for(int i=0;i<2*n;i++){
            if(Rnums[i]==indx){
                if(indx==n-1) start = i;
                indx--;
                if(indx==-1){
                    ans = min(ans, start+2);//2 reverse are needed here 
                    break;
                }
            }
            else{
                indx = n-1;
                start = -1;
                if(Rnums[i]==n-1){
                    start = i;
                    indx = n-2;
                }
            }
        }
        return ans == INT_MAX ? -1 : ans;
    }
};
