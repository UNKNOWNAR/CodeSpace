class Solution {
    private static final List<Integer> PALINDROMES = new ArrayList<>();

    static {
        PALINDROMES.add(0);

        // Iterate through all seeds (approx up to 7 bits is enough for 5000)
        for(int i = 1; i <= 128; i++) { 
            int rev = 0;
            int temp = i;
            int lengthOfSeed = 0;
            
            // 1. Calculate Reverse and Length
            while(temp != 0){
                int bit = temp & 1;
                temp = temp >> 1;
                rev = (rev << 1) | bit;
                lengthOfSeed++;
            }
            
            // 2. Construct Even Length Palindrome (e.g. 10 -> 1001)
            int evenPal = (i << lengthOfSeed) | rev;
            PALINDROMES.add(evenPal);

            // 3. Construct Odd Length Palindrome (e.g. 10 -> 101)
            // Fix: Use Mask instead of shift right to handle seeds like '10' correctly
            int mask = (1 << (lengthOfSeed - 1)) - 1;
            int oddPal = (i << (lengthOfSeed - 1)) | (rev & mask);
            PALINDROMES.add(oddPal);
        }
        
        Collections.sort(PALINDROMES);
    }

    public int[] minOperations(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            // 1. Binary Search
            int pos = Collections.binarySearch(PALINDROMES, nums[i]);

            if (pos >= 0) {
                result[i] = 0;
                continue;
            }

            // 2. Find Neighbors
            int insertionPoint = -(pos + 1);
            int dist1 = Integer.MAX_VALUE;
            int dist2 = Integer.MAX_VALUE;

            if (insertionPoint < PALINDROMES.size()) 
                dist1 = PALINDROMES.get(insertionPoint) - nums[i];
            
            if (insertionPoint > 0) 
                dist2 = nums[i] - PALINDROMES.get(insertionPoint - 1);

            result[i] = Math.min(dist1, dist2);
        }
        return result;
    }
}
