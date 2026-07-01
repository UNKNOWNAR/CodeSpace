class Solution {
    public static String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder(15);//maximum size of Roman numeral possible
        for (int i = 0; i < values.length; i++) {
            int count = num / values[i];
            if (count != 0) {
                sb.append(strs[i].repeat(count));
                num %= values[i];
            }
        }
        return sb.toString();
    }
}
