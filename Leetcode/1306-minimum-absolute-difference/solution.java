class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int minmDiff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
            minmDiff = Math.min(minmDiff,arr[i+1]-arr[i]);
        for(int i=0;i<arr.length-1;i++){
            if(minmDiff == arr[i+1]-arr[i]){
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                ans.add(temp);
            }
        }
        return ans;
    }
}
