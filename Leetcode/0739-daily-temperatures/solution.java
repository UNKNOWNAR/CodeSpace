class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] ans = new int[temps.length];
        int hottest = 0;
        for (int i = temps.length - 1; i > -1; i--) {
            if (temps[i] >= hottest) { //avoids n^2 loop on a decreasing array: 82, 79, 76, 74
                hottest = temps[i];
                continue;
            }
            int days = 1; //check from the next next day
            while (temps[i] >= temps[i + days]) {
                days += ans[i + days];
            }
            ans[i] = days;

        }
        return ans;        
    }
}
