class Solution {
    public int earliestTime(int[][] tasks) {
        int fastest = Integer.MAX_VALUE;
        for(int task[]:tasks)
            fastest = Math.min(task[0]+task[1],fastest);
        return fastest;
    }
}
