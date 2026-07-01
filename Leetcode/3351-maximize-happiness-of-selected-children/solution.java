class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long maxHappiness = 0;
        int indx = happiness.length-1;
        while(indx>happiness.length-1-k){
            maxHappiness += Math.max(0,happiness[indx]-happiness.length+1+indx);
            indx--;
        }
        return maxHappiness;
    }
}
