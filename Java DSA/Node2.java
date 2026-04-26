public class Node2 {
    int data;
    int key;
    Node2 next;
    Node2 prev;
    public Node2(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public Node2(int data,int key) {
        this.data = data;
        this.key = key;
        this.next = null;
        this.prev = null;
    }
}