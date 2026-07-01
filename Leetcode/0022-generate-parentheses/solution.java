class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(n, 0, 0, "");
        return res;
    }
    private void helper(int n, int open, int close, String s){
        if(open == close && open + close == n*2){
            res.add(s);
            return;
        }

        if(open < n){
            helper(n,open+1, close, s+"(");
        }
        if(close < open){
            helper(n, open, close+1, s+")");
        }

    }
}
