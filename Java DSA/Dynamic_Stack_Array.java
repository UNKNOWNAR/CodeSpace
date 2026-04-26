import java.util.*;
public class Dynamic_Stack_Array {
    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();

        // Push elements
        stack.add(10);
        stack.add(20);
        stack.add(30);

        // Pop and print the top element
        System.out.println(stack.getLast() + " popped from stack");
        stack.removeLast();

        // Peek at the top element
        System.out.println("Top element is: " + stack.getLast());

        // Print all elements in the stack
        System.out.print("Elements present in stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.getLast() + " ");
            stack.removeLast();
        }
    }
}
