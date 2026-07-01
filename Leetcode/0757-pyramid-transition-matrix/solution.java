class Solution {
    List<String> allowed;
    Map<String, List<Character>> map;
    Map<String, Boolean> memo;
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        memo = new HashMap<>();
        map = new HashMap<>();
        for(String seq:allowed){
            String key = seq.substring(0,2);
            List<Character> temp = new ArrayList<>();
            if(map.containsKey(key))
                temp = map.get(key);
            temp.add(seq.charAt(2));
            map.put(key,temp);
        }
        return checkBase(bottom);
    }
    private boolean checkBase(String bottom){
        if(memo.containsKey(bottom))
            return memo.get(bottom);
        if(bottom.length()==1)
            return true;
        allowed = new ArrayList<>();
        createBasestring(0,bottom,"");
        List<String> temp = new ArrayList<>();
        for(String base:allowed)
            temp.add(base);
        for(String base:temp){
            boolean ans = checkBase(base);
            if(ans){
                memo.put(bottom,ans);
                return true;
            }
        }
        memo.put(bottom,false);
        return false;
    }
    private void createBasestring(int indx,String bottom,String newBottom){
        if(indx==bottom.length()-1){
            allowed.add(newBottom);
            return;
        }
        String seq = bottom.substring(indx,indx+2);
        if(!map.containsKey(seq))
            return;
        List<Character> temp = map.get(seq);
        for(char temp1:temp)
            createBasestring(indx+1,bottom,newBottom+temp1);
    }
}
