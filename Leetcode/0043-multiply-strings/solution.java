class Solution {
    public String multiply(String num1, String num2) {
        // 1. Handle edge case: "0" * anything = "0"
        if (num1.equals("0") || num2.equals("0")) return "0";
        
        int n1 = num1.length(), n2 = num2.length();
        // The max result length is n1 + n2
        int[] result = new int[n1 + n2];
        
        // 2. Loop Backwards (Right to Left)
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                // Multiply the two digits
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                
                // Calculate position in result array
                int p1 = i + j;     // High position (Carry)
                int p2 = i + j + 1; // Low position (Current digit)
                
                // Add to existing value at this position
                int sum = mul + result[p2];
                
                // Update the slots
                result[p1] += sum / 10; // Add carry to the left
                result[p2] = sum % 10;  // Store the remainder
            }
        }
        
        // 3. Convert int array to String
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            // Skip leading zeros
            if (!(sb.length() == 0 && digit == 0)) {
                sb.append(digit);
            }
        }
        
        return sb.toString();
    }
}
