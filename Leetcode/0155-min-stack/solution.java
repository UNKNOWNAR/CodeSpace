class MinStack {
    int[] arr;
    int i = 0;
    int[] minStack;
    int j = 0;

    public MinStack() {
        arr = new int[5];
        minStack = new int[5];
    }

    public void push(int val) {
        if (i == arr.length) {
            arr = Arrays.copyOf(arr, (int) (i * 1.5));
        }

        if (j == 0 || val <= minStack[j - 1]) {
            if (j == minStack.length) {
                minStack = Arrays.copyOf(minStack, (int) (j * 1.5));
            }
            minStack[j++] = val;
        }
        arr[i++] = val;
    }

    public void pop() {
        int remove = arr[i - 1];
        if (remove == minStack[j - 1]) {
            j--;
        }
        i--;
    }

    public int top() {
        return arr[i - 1];
    }

    public int getMin() {
        return minStack[j - 1];
    }
}
