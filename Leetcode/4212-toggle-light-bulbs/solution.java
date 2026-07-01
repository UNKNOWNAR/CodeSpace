class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i:bulbs){
            if(map.containsKey(i)){
                map.put(i,!map.get(i));
            }
            else
                map.put(i,true);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i))
                ans.add(i);
        }
        Collections.sort(ans);
        return ans;
    }
}
