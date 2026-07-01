class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] pair = new int[n][2];

        // Pair up position and speed
        for (int i = 0; i < n; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        // Sort in descending order of position
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));

        int fleets = 0;
        double lastTime = 0;

        for (int i = 0; i < n; i++) {
            double time = (double) (target - pair[i][0]) / pair[i][1];
            if (time > lastTime) {
                fleets++;
                lastTime = time;
            }
            // else: this car catches up and merges into the current fleet
        }

        return fleets;
    }
}
