class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int prev[] = {triangle.get(0).get(0)};
        for(int i=1;i<triangle.size();i++){
            int curr[] = new int[i+1];
            for(int j=0;j<=i;j++){
                int down=Integer.MAX_VALUE,corner = Integer.MAX_VALUE;
                if(j<i)
                    down  = prev[j];
                if(j>0)
                    corner = prev[j-1];
                curr[j] = triangle.get(i).get(j)+Math.min(down,corner);
            }
            prev = curr;
        }
        int minPath = Integer.MAX_VALUE;
        for (int j = 0; j < triangle.size(); j++) 
            minPath = Math.min(minPath, prev[j]);
        return minPath;
    }
}
