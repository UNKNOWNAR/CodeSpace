/*Time Complexity:
push: O(1)
pop: O(1)
peek: O(1)
is_empty: O(1)
is_full: O(1)
Auxiliary Space: O(n), where n is the number of items in the stack.*/
public class Stack_Array {
    int stack[];
    int top,cap;

    public Stack_Array(int cap) {
        stack = new int[cap];
        this.cap = cap;
        top = -1;
    }

    public boolean push(int data) {
        if (top == cap-1) {
            System.out.println("Stack Overflow");
            return false;
        }
        stack[++top] = data;
        return true;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == cap-1;
    }

    public static void main(String[] args) {
        Stack_Array s = new Stack_Array(10);
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop() + " popped from stack");

        System.out.println("Top element is: " + s.peek());

        System.out.print("Elements present in stack: ");
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}