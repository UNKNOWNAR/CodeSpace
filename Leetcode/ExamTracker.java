package LeetCode.contset.Biweekly_Contest167;

import java.util.*;
import java.io.*;

/**
 * Solution for:
 * Problem:
 * LeetCode Link:
 *
 * @author UnknownAR
 * @date 11-10-2025
 */
public class ExamTracker {
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

    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        ExamTracker obj = new ExamTracker();

        obj.record(999999996, 999999996);
        obj.record(999999997, 999999997);
        obj.record(999999998, 999999998);
        obj.record(999999999, 999999999);
        obj.record(1000000000, 1000000000);

        long total = obj.totalScore(1, 1000000000);
        System.out.println(total); // Expected: 4999999990
    }
}