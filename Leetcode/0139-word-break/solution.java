class Solution {
    Set<String> wordSet;
    String s;
    Boolean dp[];
    public boolean wordBreak(String s, List<String> wordDict) {
        this.s = s;
        dp = new Boolean[s.length()];
        wordSet = new HashSet<>(wordDict);
        return FindWord(0);
    }
    public boolean FindWord(int start){
        if(start==s.length())
            return true;
        if(dp[start]!=null)
            return dp[start];
        StringBuilder sb = new StringBuilder();
        for(int i=start;i<s.length();i++){
            sb.append(s.charAt(i));
            if(wordSet.contains(sb.toString())&&FindWord(i+1))
                return dp[start] = true;
        }
        return dp[start] = false;
    }
}
