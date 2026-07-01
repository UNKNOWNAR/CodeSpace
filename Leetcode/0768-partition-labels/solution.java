class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int freQmap[] = new int[26];
        for(int i=0;i<s.length();i++)
            freQmap[s.charAt(i)-'a']++; 
        Set<Character> currentWindowChars = new HashSet<>();
        int size = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!currentWindowChars.contains(c))
                currentWindowChars.add(c);
            freQmap[c-'a']--;
            size++;
            if(freQmap[c-'a']==0)
                currentWindowChars.remove(c);
            if(currentWindowChars.size()==0){
                ans.add(size);
                size = 0;
            }
        }
        return ans;
    }
}
