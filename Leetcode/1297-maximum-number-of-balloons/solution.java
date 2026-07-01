class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] a = new int[26];
        for(char c:text.toCharArray())
            a[c-'a']++;
        String match = "balloon";
        int ans = text.length();
        for(char x:match.toCharArray()){
            if(x=='l'||x=='o')
                ans = Math.min(a[x-'a']/2,ans);
            else
                ans = Math.min(a[x-'a'],ans);
        }
        return ans;
    }
}
