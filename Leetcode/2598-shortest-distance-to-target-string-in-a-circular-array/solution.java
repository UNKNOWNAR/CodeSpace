class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        List<Integer> indx = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(target.equals(words[i]))
                indx.add(i);
        }
        int ans = n;
        for(int i:indx)
            ans = Math.min((i-startIndex+n)%n,Math.min((startIndex-i+n)%n,ans));
        return ans==n?-1:ans;
    }
}
