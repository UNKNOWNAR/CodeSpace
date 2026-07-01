class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int answer = Integer.MAX_VALUE;;
        for(int i=0;i<n;i++){
            int firstT = landStartTime[i]+landDuration[i];
            for(int j=0;j<m;j++)
                answer = Math.min(Math.max(firstT,waterStartTime[j])+waterDuration[j],answer);
        }
        for(int i=0;i<m;i++){
            int firstT = waterStartTime[i]+waterDuration[i];
            for(int j=0;j<n;j++)
                answer = Math.min(Math.max(firstT,landStartTime[j])+landDuration[j],answer);
        }
        return answer;
    }
}
