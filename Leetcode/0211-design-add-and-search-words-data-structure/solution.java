class WordDictionary {
    private class Trie{
        Trie links[];
        boolean flag;
        Trie(){
            links = new Trie[26];
            flag = false;
        }
        boolean containsChar(char c){
            return links[c-'a']!=null;
        }
        void put(char c,Trie node){
            links[c-'a'] = node;
        }
        Trie get(char c){
            return links[c-'a'];
        }
    }
    Trie solve;
    String search;
    public WordDictionary() {
        solve = new Trie();
        search = "";
    }
    
    public void addWord(String word) {
        Trie node = solve;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(!node.containsChar(c))
                node.put(c,new Trie());
            node = node.get(c);
        }
        node.flag = true;
    }
    
    public boolean search(String word) {
        search = word;
        return searchWord(solve,0);
    }

    private boolean searchWord(Trie node, int indx) {
        if (indx == search.length())
            return node.flag;

        char c = search.charAt(indx);

        if (c == '.') {
            for (int i = 0; i < 26; i++) {
                if (node.links[i] != null) {
                    if (searchWord(node.links[i], indx + 1))
                        return true;
                }
            }
            return false;
        }
        if (!node.containsChar(c))
            return false;
            
        return searchWord(node.get(c), indx + 1);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
