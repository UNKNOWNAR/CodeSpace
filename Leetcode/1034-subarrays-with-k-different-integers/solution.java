class Solution {
    //This function finds the total number of subArrays which has 
    //At most k unique numbers
    int atMost(int[] nums, int k){
        int uniqueCount = 0, i = 0, totalGood = 0;
        Map<Integer, Integer> count = new HashMap();
        /**
        What this loop does
        1. We can count the number of subArrays in (i, j) ending at j
        using the formula (j - i + 1)
        2.So We start the window from (0, 0) then increase j till unique
        occurence of unique numbers are less than k. if it goes invalid
        we increase i to valid point then starts counting again.
        3. In this way we can count the count in O(n)
         */
        for (int j=0; j < nums.length; j++){
            int cNum = nums[j];
            //update count
            count.put(cNum, count.getOrDefault(cNum, 0) + 1);

            //check if it is first occurence
            if(count.get(cNum) == 1){
                uniqueCount++;
            }

            //make sure our window is in a valid range
            while(uniqueCount > k){
                int startNum = nums[i];
                //eliminate the start
                count.put(startNum, count.get(startNum) - 1);
                //move the start of the window
                i++;
                //check if its completely eliminated from the window
                if(count.get(startNum) == 0){
                    uniqueCount--;
                }
            }

            totalGood += (j - i + 1);

        }
        return totalGood;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int exactlyK = atMost(nums, k) - atMost(nums, k-1);
        return exactlyK;
    }
}
