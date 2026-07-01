class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer,List<Integer>> index = new HashMap<>();
        for(int i=0;i<nums.length;i++){//O(n)
            List<Integer> temp = new ArrayList<>();
            if(index.containsKey(nums[i]))
                temp = index.get(nums[i]);
            temp.add(i);
            index.put(nums[i],temp);
        }
        List<Integer> result = new ArrayList<>();
        if(index.size()==1&&nums.length>1){
            int key = nums[0];
            for(int i=0;i<queries.length;i++)
                result.add(1);
            return result;
        }
        int n = nums.length;
        for(int querry:queries){//O(n^2)
            List<Integer> temp = index.get(nums[querry]);
            int ans = n;
            for(int i:temp){
                if(i==querry)
                    continue;
                ans = Math.min((i-querry+n)%n,Math.min((querry-i+n)%n,ans));
            }
            result.add(ans==n?-1:ans);
        }
        return result;
    }
}
