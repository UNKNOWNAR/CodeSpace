class Solution {
    private class Trie {
        Trie[] links = new Trie[2];
        boolean containsKey(int k) { return links[k] != null; }
        Trie get(int k) { return links[k]; }
        void put(int k, Trie node) { links[k] = node; }
    }

    private class Trio{
        int xi;
        int ai;
        int indx;
        Trio(int xi,int ai,int indx){
            this.xi = xi;
            this.ai = ai;
            this.indx = indx;
        }
    }

    Trie root;
    public int[] maximizeXor(int[] nums, int[][] queries) {
        root = new Trie();

        Arrays.sort(nums);
        int m = queries.length;
        Trio querry[] = new Trio[m];
        for(int i=0;i<m;i++)
            querry[i] = new Trio(queries[i][0],queries[i][1],i);
        Arrays.sort(querry,(a,b)->a.ai-b.ai);
        int ans[] = new int[m];
        
        int indx=0;
        for(int i=0;i<m;i++){
            int ai = querry[i].ai;
            int xi = querry[i].xi;
            while(indx<nums.length&&nums[indx]<=ai){
                insert(nums[indx]);
                indx++;
            }
            if (indx == 0) 
                ans[querry[i].indx] = -1; 
            else 
                ans[querry[i].indx] = getMax(xi);
        }

        return ans;
    }

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
                node = node.get(bit); 
            }
        }
        return ans;
    }
}
