class Solution {
    public int[] minCost(int[] nums, int[][] queries) {
        int n = nums.length;
        int ans[] = new int[queries.length];
        
        int closestIndx[] = new int[n];
        closestIndx[0] = 1;
        closestIndx[n-1] = n-2;
        for(int i=1;i<n-1;i++){
            if(Math.abs(nums[i]-nums[i-1])>Math.abs(nums[i]-nums[i+1]))
                closestIndx[i] = i+1;
            else 
                closestIndx[i] = i-1;
        }
        
        long forward[] = new long[n];
        long backward[] = new long[n];
        forward[0] = 0;
        for(int i=1;i<n;i++){
            if(closestIndx[i-1]==i)
                forward[i] = 1;
            else
                forward[i] = nums[i]-nums[i-1];
            forward[i] += forward[i-1];
        }
        backward[n-1] = 0;
        for(int i=n-2;i>=0;i--){
            backward[i] = backward[i+1];
            if(closestIndx[i+1]==i)
                backward[i] += 1;
            else
                backward[i] += nums[i+1]-nums[i];
        }
        int indx = 0;
        for(int querry[] : queries){
            int l = querry[0];
            int r = querry[1];
            int cost = 0;
            if(l>r)
                ans[indx++] = (int)(backward[r]-backward[l]);
            else
                ans[indx++] = (int)(forward[r]-forward[l]);
        }
        return ans;
    }
}
