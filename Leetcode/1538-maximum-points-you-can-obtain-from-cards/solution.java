class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lSum = 0;
        for(int i=0;i<k;i++)
            lSum += cardPoints[i];
        int maxSum = lSum;
        for(int i=0;i<k;i++){
            lSum -= cardPoints[k-i-1];
            lSum += cardPoints[n-i-1];
            maxSum = Math.max(maxSum,lSum);
        }
        return maxSum;
    }
}
