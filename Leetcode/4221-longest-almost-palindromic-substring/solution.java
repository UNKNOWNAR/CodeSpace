class Solution {
    public int almostPalindromic(String s) {
        int maxLen = 0;
        for(int i=0;i<s.length();i++){
            maxLen = Math.max(maxLen,expand(s,i,i,1));
            maxLen = Math.max(maxLen,expand(s,i,i+1,1));
        }
        return maxLen;
    }
    private int expand(String s,int left,int right,int skip){
        if((left<0||right==s.length())){
            if(skip==1){
                if(left<0&&right==s.length())
                    return 0;
                else
                    return right-left;
            }
            return right-left-1;
        }
        if(s.charAt(left)==s.charAt(right))
            return expand(s,left-1,right+1,skip);
        else if(skip==1){
            return Math.max(expand(s,left,right+1,0),expand(s,left-1,right,0));
        }
        return right-left-1;
    }
}
