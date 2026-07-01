class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        Map<Character,Integer> lower_case = new HashMap<>();
        Map<Character,Integer> upper_case = new HashMap<>();
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(Character.isLowerCase(c))
                lower_case.put(c,i);
            else if(Character.isUpperCase(c)&&!upper_case.containsKey(c))
                upper_case.put(c,i);
        }
        for(char c:lower_case.keySet()){
            int lower_indx = lower_case.get(c);
            c = Character.toUpperCase(c);
            boolean res = upper_case.containsKey(c);
            if(res&&upper_case.get(c)>lower_indx)
                count++;
        }
        return count;
    }
}
