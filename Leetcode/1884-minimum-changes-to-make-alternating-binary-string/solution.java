class Solution {
    public int minOperations(String s) {
        int bit=0,op1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'!=bit)
                op1++;
            bit++;
            bit = bit%2;
        }
        return Math.min(op1,s.length()-op1);
    }
}
