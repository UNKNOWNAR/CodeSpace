class Solution {
    public int smallestAbsent(int[] nums) {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double average = sum / nums.length;
        Set<Integer> presentNumbers = new HashSet<>();
        for (int num : nums) {
            presentNumbers.add(num);
        }
        int candidate = (int) Math.floor(average) + 1;
        if (candidate < 1) {
            candidate = 1;
        }
        while (presentNumbers.contains(candidate)) {
            candidate++;
        }

        return candidate;
    }
}
