class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        if(k==sb.length())
            return sb.reverse().toString();
        StringBuilder ans = new StringBuilder(sb.substring(0, k)).reverse();
        ans.append(sb.substring(k));
        return ans.toString();
    }
}
