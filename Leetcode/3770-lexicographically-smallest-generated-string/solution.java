class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int N = n+m-1;
        char[] word = new char[N];
        boolean canchange[] = new boolean[N];
        Arrays.fill(word,'A');
        for(int i=0;i<n;i++){
            if(str1.charAt(i)=='T'){
                for (int j = 0; j < m; j++) {
                    char required = str2.charAt(j);
                    if (word[i + j] != 'A' && word[i + j] != required) 
                        return ""; 
                    word[i + j] = required;
                }
            }
        }
        for(int i=0;i<N;i++){
            if(word[i]=='A'){
                word[i] = 'a';
                canchange[i] = true;
            }
        }
        for(int i=0;i<n;i++){
            if(str1.charAt(i)=='F'){
                boolean needChnage = true;
                for (int j = 0; j < m; j++) {
                    if(word[i+j]!=str2.charAt(j)){
                        needChnage = false;    
                        break;
                    }
                }
                if(needChnage){
                    for(int j=i+m-1;j>=i;j--){
                        if(canchange[j]){
                            word[j] = 'b';
                            needChnage = false;
                            break;
                        }
                    }
                }
                if(needChnage)
                    return "";
            }
        }
        return new String(word);
    }
}
