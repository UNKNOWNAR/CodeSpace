class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));//sort strings based on their lengths
        int n = words.length;
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        int maxi = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(compare(words[i],words[j])&&1+dp[j]>dp[i])
                    dp[i] = dp[j]+1;
            }
            if(dp[i]>maxi)
                maxi = dp[i];
        }
        return maxi;
    }
    private boolean compare(String str,String str1){
        if(str.length()!=str1.length()+1) return false;
        int p1=0,p2=0;
        while(p1<str.length()){
            if(p2 < str1.length() && str.charAt(p1) == str1.charAt(p2)){
                p1++;
                p2++;
            }
            else
                p1++;
        }
        if(p1==str.length()&&p2==str1.length())
            return true;
        return false;
    }
}
