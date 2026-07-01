class Trie {
    private class Node{
        Node links[];
        boolean flag;
        Node(){
            flag = false;
            links = new Node[26];
        }
        private boolean containsKey(char ch){
            return links[ch-'a']!=null;
        }
        private Node getNextLink(char ch){
            return links[ch-'a'];
        }
        private void setEnd(){
            flag = true;
        }
    }
    Node root;
    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!node.containsKey(ch))
                node.links[ch-'a'] = new Node();
            node = node.getNextLink(ch);
        }
        node.setEnd();
    }
    
    public boolean search(String word) {
        Node node = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!node.containsKey(ch))
                return false;
            node = node.getNextLink(ch);
        }
        return node.flag;
    }
    
    public boolean startsWith(String prefix) {
        Node node = root;
        for(int i=0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            if(!node.containsKey(ch))
                return false;
            node = node.getNextLink(ch);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
