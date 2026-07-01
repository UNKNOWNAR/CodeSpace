class Solution {
    public int[] sortedSquares(int[] nums) {
        int posindx=0,l=nums.length;
        for(int i=0;i<l;i++){
            if(i>0&&nums[i-1]<0&&nums[i]>=0)
                posindx = i;
        }
        int ans[] = new int[l];
        int y = posindx-1;
        if(posindx==0&&nums[l-1]<0)
            y=l-1;
        for(int i=0;i<l;i++){
            if(y>=0&&posindx<l){
                if(Math.abs(nums[y])<Math.abs(nums[posindx])){
                    ans[i] = nums[y]*nums[y];
                    y--;
                }
                else{
                    ans[i] = nums[posindx]*nums[posindx];
                    posindx++;
                }
            }
            else if(posindx==l){
                ans[i] = nums[y]*nums[y];
                y--;
            }
            else{
                ans[i] = nums[posindx]*nums[posindx];
                posindx++;
            }
        }
        return ans;
    }
}
