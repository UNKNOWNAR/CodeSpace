class Solution {
    private String word1,word2;
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int prev[] = new int[m+1];
        for(int i = 0;i<=m;i++)
            prev[i] = i;
        for(int indx1=1;indx1<=n;indx1++){
            int curr[] = new int[m+1];
            curr[0] = indx1;
            for(int indx2=1;indx2<=m;indx2++){
                if(word1.charAt(indx2-1)==word2.charAt(indx1-1))
                    curr[indx2] = prev[indx2-1];
                else{
                    int insert = curr[indx2-1];
                    int del = prev[indx2];
                    int replace = prev[indx2-1];
                    curr[indx2] = 1+Math.min(insert,Math.min(del,replace));
                }
            }
            prev=curr;
        }
        return prev[m];
    }
}
