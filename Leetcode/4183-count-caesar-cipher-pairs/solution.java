class Solution {
    public long countPairs(String[] words) {
        long count = 0;
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            char word[] = words[i].toCharArray();
            String key = normalizeString(word);
            count += map.getOrDefault(key,0);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return count;
    }
    private String normalizeString(char arr[]){
        int shift = arr[0]-'a';
        for(int i=0;i<arr.length;i++){
            int val = (char)((arr[i]-'a'-shift+26)%26);
            arr[i] = (char)(val+'a');
        }
        return new String(arr);
    }
}
