class Solution {
    private class Trie{
        Trie links[];
        String flag;
        Trie(){
            flag = null;
            links = new Trie[26];
        }
        private boolean containsKey(char ch){
            return links[ch-'a']!=null;
        }
        private Trie getNextLink(char ch){
            return links[ch-'a'];
        }
        private void setEnd(String word){
            flag = word;
        }
        private void put(char ch,Trie node){
            links[ch-'a'] = node;
        }
    }

    private int m, n;
    private static int directions[][]={{0,1},{0,-1},{1,0},{-1,0}};
    Trie root;
    List<String> ans;
    private void insert(String word) {
        Trie node = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!node.containsKey(ch))
                node.links[ch-'a'] = new Trie();
            node = node.getNextLink(ch);
        }
        node.setEnd(word);
    }

    public List<String> findWords(char[][] board, String[] words) {
        root = new Trie();
        ans = new ArrayList<>();
        for(String word:words)
            insert(word);
        
        m = board.length;
        n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (root.containsKey(board[i][j])) 
                    dfs(root,i,j,board);
            }
        }
        return ans;
    }

    private void dfs(Trie root,int row,int col,char[][] board){
        if (row < 0 || col < 0 || row >= m || col >= n || root == null)
            return;
        char temp = board[row][col];
        if (temp == '#' || !root.containsKey(temp))
            return;
        Trie next = root.getNextLink(temp);

        if(next.flag!=null){
            ans.add(next.flag);
            next.flag = null;
        }
        board[row][col] = '#'; // mark visited

        for(int i=0;i<4;i++)
            dfs(next,row+directions[i][0],col+directions[i][1],board);
        board[row][col] = temp;
        return;
    }   
}
