class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0)
            return List.of(1);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(1);
        for(int i=2;i<=rowIndex;i++){
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j=0;j<ans.size()-1;j++)
                curr.add(ans.get(j)+ans.get(j+1));
            curr.add(1);
            ans = curr;
        }
        return ans;
    }
}
