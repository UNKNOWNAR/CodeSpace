class Solution {
    public int residuePrefixes(String s) {
        int ans = 0;
        Set<Character> unique = new HashSet<>();
        for(int i=0;i<s.length();i++){
            unique.add(s.charAt(i));
            if((i+1)%3==unique.size())
                ans++;
        }
        return ans;
    }
}
