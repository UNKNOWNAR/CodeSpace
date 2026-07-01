class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n = s1.length();
        char evenMap[] = new char[26];
        char oddMap[] = new char[26];
        for(int i=0;i<n;i++){
            char c = s1.charAt(i);
            if(i%2==0)
                evenMap[c-'a']++;
            else
                oddMap[c-'a']++;
        }
        for(int i=0;i<n;i++){
            char c = s2.charAt(i);
            if(i%2==0){
                if(evenMap[c-'a']>0)
                    evenMap[c-'a']--;
                else    return false;
            }
            else{
                if(oddMap[c-'a']>0)
                    oddMap[c-'a']--;
                else    return false;
            }
        }
        return true;
    }
}
