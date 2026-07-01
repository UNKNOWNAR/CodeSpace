class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;

        // 1. Setup
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        Map<Character, Integer> counts = new HashMap<>();
        for (char t : tasks) counts.put(t, counts.getOrDefault(t, 0) + 1);
        maxHeap.addAll(counts.values());

        // 2. Cooldown Queue
        Queue<Pair> queue = new LinkedList<>();
        int time = 0;

        // 3. Simulation
        while (!maxHeap.isEmpty() || !queue.isEmpty()) {
            time++; // 1. Tick the clock

            // 2. Try to run a task
            if (!maxHeap.isEmpty()) {
                int remaining = maxHeap.poll() - 1;
                if (remaining > 0) {
                    queue.add(new Pair(remaining, time + n));
                }
            }

            // 3. Check if any cooled task is ready to return
            // Note: Since time strictly increases, a simple Queue (FIFO) works perfectly here.
            if (!queue.isEmpty() && queue.peek().time == time) {
                maxHeap.add(queue.poll().taskCount);
            }
        }
        return time;
    }

    private class Pair {
        int taskCount;
        int time;
        Pair(int taskCount, int time) {
            this.taskCount = taskCount;
            this.time = time;
        }
    }
}
