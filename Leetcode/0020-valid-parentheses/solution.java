class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)
            return false;
        Map<Character,Character> map= new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        Deque<Character> stack = new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='[')
                stack.push(c);
            else if(stack.isEmpty()||stack.pop()!=map.get(c))
                return false;
        }
        return stack.isEmpty();
    }
}
