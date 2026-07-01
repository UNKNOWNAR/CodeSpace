class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] sMap =  new int[256];
        int[] tMap =  new int[256];
        char schar[] = s.toCharArray();
        char tchar[] = t.toCharArray();
        for(int i=0;i<s.length();i++){
            if(sMap[schar[i]] == 0 && tMap[tchar[i]] == 0){
                sMap[schar[i]] = tchar[i];
                tMap[tchar[i]] = schar[i];
            }else {
                if(sMap[schar[i]] != tchar[i] || tMap[tchar[i]] != schar[i])
                    return false;
            }
        }
        return true;
    }
}
