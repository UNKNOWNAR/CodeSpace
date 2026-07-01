class Solution {
    public int minimumDeletions(String s) {
        if(s.length()==1)
            return 0;
        int bCount = 0;
        int deletions = s.length();
        int aCount[] = new int[s.length()];
        if(s.charAt(deletions-1)=='a')
            aCount[deletions-1] = 1;
        for (int i=s.length()-2;i>=0;i--){
            if(s.charAt(i)=='a')
                aCount[i] = aCount[i+1]+1;
            else
                aCount[i] = aCount[i+1];
        }
        
        for(int i=0;i<s.length();i++){
            deletions = Math.min(deletions,bCount+aCount[i]);
            if(s.charAt(i)=='b')
                bCount++;
        }
        return Math.min(deletions, bCount);
    }
}
