class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans = "";
        for(String word:words){
            int weight = 0;
            for(int i=0;i<word.length();i++)
                weight += weights[word.charAt(i)-'a'];
            weight = weight%26;
            ans += (char)('a'+25-weight);
        }
        return ans;
    }
}
