class Solution {
    private class Trie{
        Trie links[];
        boolean flag;
        Trie(){
            links = new Trie[26];
            flag = false;
        }
        boolean containsKey(char c){
            return links[c-'a']!=null;
        }
        Trie get(char c){
            return links[c-'a'];
        }
        void put(char c,Trie node){
            links[c-'a'] = node;
        }
    }
    Trie solv;
    String longest;
    private void insert(String word){
        Trie node = solv;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(!node.containsKey(c))
                node.put(c,new Trie());
            node  = node.get(c);
        }
        node.flag = true;
    }
    private void checkPrefix(String word){
        if(longest.length()>word.length())
            return;
        Trie node = solv;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            node  = node.get(c);
            if(node.flag==false)
                return;
        }
        if(node.flag==true){
            if(longest.length()<word.length())
                longest = word;
            else if(longest.length()==word.length()&&word.compareTo(longest)<0)
                longest = word;
        }
    }
    public String longestWord(String[] words) {
        if(words.length==1)
            return words[0];
        solv = new Trie();
        longest = "";
        for(String word:words)
            insert(word);
        for(String word:words)
            checkPrefix(word);
        return longest;
    }
}
