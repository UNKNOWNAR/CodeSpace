class ExamTracker {

    List<Integer> savedTimes;
    List<Long> prefixSums;

    public ExamTracker() {
        savedTimes = new ArrayList<>();
        prefixSums = new ArrayList<>();
    }
    public void record(int time, int score) {
        savedTimes.add(time);
        long newSum = score + (prefixSums.isEmpty() ? 0 : prefixSums.getLast());
        prefixSums.add(newSum);
    }
    public long totalScore(int startTime, int endTime) {
        int left = lowerBound(savedTimes, startTime);
        int right = upperBound(savedTimes, endTime);

        if (left == savedTimes.size() || right == -1 || left > right) return 0;

        long total = prefixSums.get(right);
        if (left > 0) total -= prefixSums.get(left - 1);
        return total;
    }
    public int lowerBound(List<Integer> nums, int target) {
        int l = 0, r = nums.size() - 1, ans = nums.size();
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums.get(m) >= target) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }
    public int upperBound(List<Integer> nums, int target) {
        int l = 0, r = nums.size() - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums.get(m) <= target) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }
}

/**
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker obj = new ExamTracker();
 * obj.record(time,score);
 * long param_2 = obj.totalScore(startTime,endTime);
 */
