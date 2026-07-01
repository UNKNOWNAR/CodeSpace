class Solution {
    public String removeDigit(String number, char digit) {
        for (int i = 0; i < number.length() - 1; ++i)
        if (number.charAt(i) == digit && number.charAt(i + 1) > digit)
            return number.substring(0, i) + number.substring(i + 1);
        int last_d = number.lastIndexOf(digit);
        return number.substring(0, last_d) + number.substring(last_d + 1);
    }            
}
