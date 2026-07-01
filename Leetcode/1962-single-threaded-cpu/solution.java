class Solution {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[][] newTasks = new int[n][3];
        for (int i = 0; i < n; i++) {
            newTasks[i][0] = tasks[i][0];  // enqueueTime
            newTasks[i][1] = tasks[i][1];  // processingTime
            newTasks[i][2] = i;            // original index
        }

        // Sort by enqueueTime
        Arrays.sort(newTasks, (a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] != b[1] ? Integer.compare(a[1], b[1]) : Integer.compare(a[2], b[2])
        );

        int[] result = new int[n];
        int time = 0, i = 0, resIdx = 0;

        while (resIdx < n) {
            // Add all tasks whose enqueueTime ≤ time
            while (i < n && newTasks[i][0] <= time) {
                pq.offer(new int[]{newTasks[i][0], newTasks[i][1], newTasks[i][2]});
                i++;
            }

            if (!pq.isEmpty()) {
                int[] task = pq.poll();
                time += task[1];
                result[resIdx++] = task[2]; // store original index
            } else {
                // No tasks are ready, jump to next enqueueTime
                time = newTasks[i][0];
            }
        }

        return result;
    }
}

