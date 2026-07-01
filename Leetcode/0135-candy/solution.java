class Solution {
    public int candy(int[] ratings) {
        if (ratings.length <= 1) {
            return ratings.length;
        }

        int totalCandies = 1;
        int i = 1;

        while (i < ratings.length) {
            if (ratings[i] == ratings[i - 1]) {
                totalCandies += 1;
                i++;
                continue;
            }

            // Uphill sequence
            int up = 0;
            while (i < ratings.length && ratings[i] > ratings[i - 1]) {
                up++;
                totalCandies += (1 + up);
                i++;
            }

            // Downhill sequence
            int down = 0;
            while (i < ratings.length && ratings[i] < ratings[i - 1]) {
                down++;
                totalCandies += down;
                i++;
            }
            
            // Adjust candy for the peak if downhill is longer
            if (down > up) {
                totalCandies += (down - up);
            }
        }
        return totalCandies;
    }
}
