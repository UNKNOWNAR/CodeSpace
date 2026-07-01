class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int count[] = new int[26];
        int maxCount=0;
        int maxLength = 0;
        while(right<s.length()){
            int indx = s.charAt(right)-'A';
            count[indx]++;
            maxCount = Math.max(count[indx],maxCount);

            if(right-left+1-maxCount>k){
                count[s.charAt(left)-'A']--;
                left++;
            }

            maxLength = Math.max(maxLength,right-left+1);
            right++;
        }
        return maxLength;
    }
}
