class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length / 2 + 1]; // reduced size
        int top = 0;

        for (String s : tokens) {
            if (s.equals("+")) {
                stack[top - 2] += stack[--top];
            } else if (s.equals("-")) {
                stack[top - 2] -= stack[--top];
            } else if (s.equals("*")) {
                stack[top - 2] *= stack[--top];
            } else if (s.equals("/")) {
                stack[top - 2] /= stack[--top];
            } else {
                stack[top++] = Integer.parseInt(s);
            }
        }

        return stack[0]; 
    }
}
