class Solution {
    public int prefixConnected(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        int count = 0;
        for(String word:words){
            if(word.length()<k)
                continue;
            String p = word.substring(0,k);
            map.put(p, map.getOrDefault(p, 0) + 1);
            if(map.get(p)==2) count++;
        }
        return count;
    }
}
