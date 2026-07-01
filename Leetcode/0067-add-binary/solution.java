class Solution {
    public String addBinary(String a, String b) {
        StringBuilder num1 = new StringBuilder(a);
        StringBuilder num2 = new StringBuilder(b);
        StringBuilder ans = new StringBuilder();

        int maxLen = Math.max(num1.length(),num2.length());
        int carry = 0;
        int indx=0;
        while(indx<maxLen||carry!=0){
            if(indx<num1.length()&&num1.charAt(num1.length()-indx-1)=='1')
                carry++;
            if(indx<num2.length()&&num2.charAt(num2.length()-indx-1)=='1')
                carry++;
            if(carry==1||carry==3){
                ans.append('1');
                if(carry==3)
                    carry=1;
                else
                    carry--;
            }
            else{
                ans.append('0');
                if(carry==2)
                    carry--;
            }
            indx++;
        }
        return ans.reverse().toString();
    }
}
