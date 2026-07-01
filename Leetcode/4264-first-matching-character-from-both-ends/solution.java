class Solution {
    public int firstMatchingIndex(String s) {
       int n= s.length();
        int ans = n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt(n-i-1))
                ans = Math.min(i,ans);
        }
        return ans==n?-1:ans;
    }
}
