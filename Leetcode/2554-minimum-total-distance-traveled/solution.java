class Solution {
    List<Integer> factories;
    Long dp[][];
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        factories = new ArrayList<>();
        for(int temp[]:factory){
            for(int i=0;i<temp[1];i++)  
                factories.add(temp[0]);
        }
        Collections.sort(factories);
        dp = new Long[robot.size()][factories.size()];
        return helper(robot,0,0);
    }
    private long helper(List<Integer> robot,int i,int j){
        if(i==robot.size())
            return 0;
        if(j==factories.size())
            return (long)1e18;
        if(dp[i][j]!=null)
            return dp[i][j];
        long take = Math.abs(robot.get(i)-factories.get(j))+helper(robot,i+1,j+1);
        long skip = helper(robot,i,j+1);
        return dp[i][j] = Math.min(take,skip);
    }
}
