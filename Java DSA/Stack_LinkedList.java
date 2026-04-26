/*Time Complexity: O(1), for all push(), pop(), and peek(), as we are not performing any kind of traversal over the list.
Auxiliary Space: O(n), where n is the size of the stack*/
public class Stack_LinkedList {
    Node head;

    Stack_LinkedList() {
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void pop(){
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        head = head.next;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return head.data;

    }
    public static void main(String[] args) {
        // Creating a stack
        Stack_LinkedList st = new Stack_LinkedList();

        // Push elements onto the stack
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);

        // Print top element of the stack
        System.out.println("Top element is " + st.peek());

        // removing two elemements from the top
        System.out.println("Removing two elements...");
        st.pop();
        st.pop();

        // Print top element of the stack
        System.out.println("Top element is " + st.peek());
    }
}