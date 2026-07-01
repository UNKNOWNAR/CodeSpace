class Solution {
    public int maxDistinct(String s) {
        Set<Character> map = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!(map.contains(s.charAt(i))))
                map.add(s.charAt(i));
        }
        return map.size();
    }
}
