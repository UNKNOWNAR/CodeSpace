class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        // Step 1: Compute prefix XORs in-place
        for (int i = 1; i < n; i++) {
            arr[i] ^= arr[i - 1];
        }

        int[] ans = new int[queries.length];
        // Step 2: Answer queries in O(1)
        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0];
            int R = queries[i][1];
            
            if (L == 0) {
                ans[i] = arr[R];
            } else {
                ans[i] = arr[R] ^ arr[L - 1];
            }
        }
        return ans;
    }
}
