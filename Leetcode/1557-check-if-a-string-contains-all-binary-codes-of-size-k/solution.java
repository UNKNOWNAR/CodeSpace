class Solution {
    public boolean hasAllCodes(String s, int k) {
    int totalRequired = 1 << k;
    boolean[] found = new boolean[totalRequired];
    int count = 0;
    int hash = 0;
    int allOnes = totalRequired - 1; 

    for (int i = 0; i < s.length(); i++) {
        hash = ((hash << 1) & allOnes) | (s.charAt(i) - '0');
        if (i >= k - 1) {
            if (!found[hash]) {
                found[hash] = true;
                count++;
                if (count == totalRequired) return true;
            }
        }
    }
    return false;
}
}
