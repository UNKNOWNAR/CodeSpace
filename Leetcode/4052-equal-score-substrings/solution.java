class Solution {
    public boolean scoreBalance(String s) {
        StringBuilder sb =  new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            int sum = 0;
            for (int j = 0; j<=i; j++) {
                sum += sb.charAt(j)-'a'+1;
            }
            for(int j=i+1;j<sb.length();j++){
                sum -= sb.charAt(j)-'a'+1;
            }
            if(sum==0)
                return true;
        }
        return false;
    }
}
