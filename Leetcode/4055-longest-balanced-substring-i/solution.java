class Solution {
    public int longestBalanced(String s) {
        int ans = 1;
        for (int i = 0; i < s.length(); i++) {
            Map<Character,Integer> frequency = new HashMap<>();
            int maxFreq = 0;
            frequency.put(s.charAt(i), 1);
            for (int j = i+1; j < s.length(); j++) {
                frequency.put(s.charAt(j),frequency.getOrDefault(s.charAt(j),0)+1);
                maxFreq = Math.max(maxFreq,frequency.get(s.charAt(j)));
                if(maxFreq*frequency.size()==j-i+1)
                    ans = Math.max(j-i+1,ans);
            }

        }
        return ans;
    }
}
