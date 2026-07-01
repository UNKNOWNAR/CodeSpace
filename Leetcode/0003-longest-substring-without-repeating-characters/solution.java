class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(),len = 0,maxLen = 0,l=0,r=0;
        int indx[] = new int[256];
        Arrays.fill(indx,-1);
        while(r<n){
            char c = s.charAt(r);
            if(indx[c]>=l)
                l = indx[c]+1;
            indx[c] = r;
            maxLen = Math.max(r-l+1,maxLen);
            r++;
        }
        return maxLen;
    }
}
