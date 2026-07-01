class Solution {
    public int[] plusOne(int[] digits) {
        int arr[];
        int l = digits.length;
        int carry=1;
        for(int i=1;i<=l;i++)
        {
            digits[l-i]+=carry;
            carry=digits[l-i]/10;
            digits[l-i]=digits[l-i]%10;
            if(carry==0)
                return digits;
        }
        arr = new int[l+1];
        arr[0] = carry;
        return arr;
    }
}    
