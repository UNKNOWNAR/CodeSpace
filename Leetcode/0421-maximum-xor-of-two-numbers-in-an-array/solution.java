class Solution {
    private class Trie {
        Trie[] links = new Trie[2];
        boolean containsKey(int k) { return links[k] != null; }
        Trie get(int k) { return links[k]; }
        void put(int k, Trie node) { links[k] = node; }
    }

    Trie root;

    private void insert(int num) {
        Trie node = root;
        for (int i = 30; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (!node.containsKey(bit))
                node.put(bit, new Trie());
            node = node.get(bit);
        }
    }

    private int getMax(int num) {
        Trie node = root;
        int ans = 0;

        for (int i = 30; i >= 0; i--) {
            int bit = (num >> i) & 1;
            int want = 1 - bit;

            if (node.containsKey(want)) {
                ans |= (1 << i);
                node = node.get(want);
            } else {
                node = node.get(bit); // guaranteed to exist
            }
        }
        return ans;
    }

    public int findMaximumXOR(int[] nums) {
        root = new Trie();

        for (int num : nums) insert(num);

        int max = 0;
        for (int num : nums)
            max = Math.max(max, getMax(num));

        return max;
    }
}

