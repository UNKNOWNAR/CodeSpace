class Solution {
    public int mirrorFrequency(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        int sum = 0;
        for(char c:map.keySet()){
            if(map.get(c)==0)
                continue;
            char x;
            if(c-'a'>=0&&c-'a'<26)
                x = (char) ('z' - (c - 'a'));
            else
                x = (char) ('9' - (c - '0'));
            if(map.containsKey(x)&& map.get(x) > 0){
                sum += Math.abs(map.get(x)-map.get(c));
                map.put(x,0);
            }
            else
                sum += map.get(c);
            map.put(c,0);
        }
        return sum;
    }
}
