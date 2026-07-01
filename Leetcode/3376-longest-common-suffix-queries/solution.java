class Solution {
    private class TrieNode {
        int indx;
        TrieNode[] children;
        TrieNode() {
            indx = -1; 
            children = new TrieNode[26];
        }
    }
    private void insert(TrieNode node,String[] wordsContainer,int indx){
        String word = wordsContainer[indx];
        int len = word.length();
        for(int i=len-1;i>=0;i--){
            if(node.indx==-1||wordsContainer[node.indx].length()>len)
                node.indx = indx;
            int child_indx = word.charAt(i)-'a';
            TrieNode child = null;
            if(node.children[child_indx]==null)
                node.children[child_indx] = new TrieNode();
            node = node.children[child_indx];
        }
        if(node.indx==-1||wordsContainer[node.indx].length()>len)
            node.indx = indx;
    }
    private int search(TrieNode node,String word){
        int len = word.length();
        for(int i=len-1;i>=0;i--){
            int child_indx = word.charAt(i)-'a';
            if(node.children[child_indx]==null)
                break;
            node = node.children[child_indx];
        }
        return node.indx;
    }
    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        TrieNode node = new TrieNode();
        int m = wordsContainer.length;
        int n = wordsQuery.length;
        int[] result = new int[n];
        for(int i=0;i<m;i++)
            insert(node,wordsContainer,i);
        for(int i=0;i<n;i++)
            result[i] = search(node,wordsQuery[i]);
        return result;
    }
}
