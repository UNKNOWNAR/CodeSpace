class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        return Math.min(
            solveWithBinarySearch(landStartTime, landDuration, waterStartTime, waterDuration),
            solveWithBinarySearch(waterStartTime, waterDuration, landStartTime, landDuration)
        );
    }

    private int solveWithBinarySearch(int[] start1, int[] dur1, int[] start2, int[] dur2) {
        int[] finish1 = new int[start1.length];
        for (int i = 0; i < start1.length; i++) {
            finish1[i] = start1[i] + dur1[i];
        }
        Arrays.sort(finish1);

        int minTotal = Integer.MAX_VALUE;
        for (int i = 0; i < start2.length; i++) {
            int idx = lowerBound(finish1, start2[i]);
            
            if (idx > 0) {
                minTotal = Math.min(minTotal, start2[i] + dur2[i]);
            }
            if (idx < finish1.length) {
                minTotal = Math.min(minTotal, Math.max(finish1[0], start2[i]) + dur2[i]);
            }
        }
        return minTotal;
    }

    private int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
