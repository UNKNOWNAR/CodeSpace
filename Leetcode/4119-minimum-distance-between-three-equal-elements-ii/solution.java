class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> indexMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            if(indexMap.containsKey(nums[i]))
                temp = indexMap.get(nums[i]);
            temp.add(i);
            indexMap.put(nums[i],temp);
        }
        int minDistance = Integer.MAX_VALUE;    
        for(int key:indexMap.keySet()){
            ArrayList<Integer> temp = indexMap.get(key);
            if (temp.size() < 3) continue;
            for(int i=0;i<temp.size()-2;i++)
                minDistance = Math.min(minDistance,2*(temp.get(i+2)-temp.get(i)));
        }
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}
