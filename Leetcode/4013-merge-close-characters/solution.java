class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for(int i =0;i<n;i++){
            char c = s.charAt(i);
            boolean foundMatch = false;
            int size = Math.max(0,ans.length()-k);
            for(int j=ans.length()-1;j>=size;j--){
                if (ans.charAt(j) == c) {
                    foundMatch = true;
                    break;
                }
            }
            if(!foundMatch){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
