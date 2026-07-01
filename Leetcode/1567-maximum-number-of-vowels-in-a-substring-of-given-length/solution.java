class Solution {
    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        char c[] = s.toCharArray();
        int n = c.length;
        int vowelCount = 0;
        int ans = 0;
        for(int i=0;i<k;i++){
            if(isVowel(c[i]))
               vowelCount++; 
        }
        ans = vowelCount;
        for(int i=k;i<n;i++){
            if(isVowel(c[i-k]))
                vowelCount--;
            if(isVowel(c[i]))
                vowelCount++;
            ans = Math.max(ans,vowelCount);
        }
        return ans;
    }
}
