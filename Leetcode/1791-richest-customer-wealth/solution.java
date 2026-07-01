class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth  = 0;
        for(int customer[]:accounts){
            int totalWealth = 0;
            for(int wealth:customer)
                totalWealth += wealth;
            maxWealth = Math.max(maxWealth,totalWealth);
        }
        return maxWealth;
    }
}
