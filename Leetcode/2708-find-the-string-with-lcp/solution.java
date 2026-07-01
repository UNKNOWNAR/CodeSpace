class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++)
            ans.append('$');
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(lcp[j][i]!=0){//first character always same
                    ans.setCharAt(i,ans.charAt(j));
                    break;
                }
            }
            if(ans.charAt(i)=='$'){
                boolean forbidden[] = new boolean[26];
                for(int j=0;j<i;j++){
                    if(lcp[j][i]==0)
                        forbidden[ans.charAt(j)-'a'] = true;
                }
                for(int k=0;k<26;k++){
                    if(!forbidden[k]){
                        ans.setCharAt(i,(char)(k+'a'));
                        break;
                    }
                }
            }
            if(ans.charAt(i)=='$')
                return "";
        }
        return checkLCP(ans,lcp)?ans.toString():"";
    }
    boolean checkLCP(StringBuilder word,int[][] lcp1){
        int n = lcp1.length;
        int lcp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            lcp[i][n-1] = (word.charAt(i)==word.charAt(n-1))?1:0;
            lcp[n-1][i] = (word.charAt(i)==word.charAt(n-1))?1:0;
        }
        for(int i=n-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                if(word.charAt(i)==word.charAt(j))
                    lcp[i][j] = 1+lcp[i+1][j+1];
                else lcp[i][j] = 0;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(lcp[i][j]!=lcp1[i][j])
                    return false;
            }
        }
        return true;
    }
}
