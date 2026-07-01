class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int limit = (int)Math.cbrt(n);
        int[] cubes = new int[limit + 1];
        for (int i = 1; i <= limit; i++) 
            cubes[i] = i * i * i;
        for(int i=1;i<=limit;i++){
            for(int j=i+1;j<=limit;j++){
                int sum = cubes[i] + cubes[j];
                if(sum>n)
                    break;
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int key:map.keySet()){
            if(key<=n&&map.get(key)>=2)
                ans.add(key);
        }
        Collections.sort(ans);
        return ans;    
    }
}
