class Solution {
    public int minCost(String colors, int[] neededTime) {
        int minTime = 0;
        for(int i=0;i<colors.length()-1;i++){
            int sum = neededTime[i];
            int max = neededTime[i];
            while(i<colors.length()-1&&colors.charAt(i)==colors.charAt(i+1)){
                sum += neededTime[i+1];
                max = Math.max(max,neededTime[i+1]);
                i++;
            }
            minTime += sum-max;
        }
        return minTime;
    }
}
