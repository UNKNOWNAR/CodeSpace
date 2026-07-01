class Solution {
    public String maximumXor(String s, String t) {
        int zeroCount = 0;
        int oneCount = 0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='0')
                zeroCount++;
            else
                oneCount++;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<t.length();i++){
            if(s.charAt(i)=='1'){
                if(zeroCount>0){
                    ans.append('1');
                    zeroCount--;
                }
                else{
                    ans.append('0');
                    oneCount--;
                }
            }
            else{
                if(oneCount>0){
                    ans.append('1');
                    oneCount--;
                }
                else{
                    ans.append('0');
                    zeroCount--;
                }
            }
        }
        return ans.toString();
    }
}
