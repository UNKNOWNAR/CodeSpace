class Solution {
    private class VowelInfo{
        char c;
        int freq;
        int firstOcuurance;
        VowelInfo(char c,int freq,int firstOcuurance){
            this.c = c;
            this.freq = freq;
            this.firstOcuurance = firstOcuurance;
        }
    }
    public String sortVowels(String s) {
        int freqMap[] = new int[26];
        int firstIdx[] = new int[26];
        Arrays.fill(firstIdx,-1);
        char cArray[] = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freqMap[c-'a']++;
            if(firstIdx[c-'a']==-1)
                firstIdx[c-'a']=i;
        }
        String vowelsStr = "aeiou";
        Set<Character> vowelSet = new HashSet<>();
        for (char v : vowelsStr.toCharArray()) vowelSet.add(v);
        List<VowelInfo> vowelList = new ArrayList<>();
        for (char v : vowelsStr.toCharArray()) {
            if (freqMap[v-'a'] > 0) 
                vowelList.add(new VowelInfo(v, freqMap[v-'a'], firstIdx[v-'a']));
        }
        vowelList.sort((a, b) -> {
            if (b.freq != a.freq) return b.freq - a.freq;
                return a.firstOcuurance-b.firstOcuurance;
        });
        int indx = 0;
        for(int i=0;i<s.length();i++){
            if(vowelSet.contains(cArray[i])){
                cArray[i] = vowelList.get(indx).c;
                vowelList.get(indx).freq--;
                if(vowelList.get(indx).freq==0)
                    indx++;
            }
        }
        return new String(cArray);
    }
}
