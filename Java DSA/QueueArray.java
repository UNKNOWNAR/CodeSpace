// Java program for insertion and deletion in Circular Queue
class QueueArray {
    private int[] arr;
    private int front, size;
    private int capacity;

    // Constructor to initialize the queue
    public QueueArray(int c) {
        arr = new int[c];
        capacity = c;
        size = 0;
        front = 0;
    }

    // Get the front element
    public int getFront() {
        // Queue is empty
        if (size == 0)
            return -1;
        return arr[front];
    }

    // Get the rear element
    public int getRear() {
        // Queue is empty
        if (size == 0)
            return -1;
        int rear = (front + size - 1) % capacity;
        return arr[rear];
    }

    // Insert an element at the rear
    public void enqueue(int x) {
        // Queue is full
        if (size == capacity)
            return;
        int rear = (front + size) % capacity;
        arr[rear] = x;
        size++;
    }

    // Remove an element from the front
    public int dequeue() {
        // Queue is empty
        if (size == 0)
            return -1;
        int res = arr[front];
        front = (front + 1) % capacity;
        size--;
        return res;
    }
    public static void main(String[] args) {
        QueueArray q = new QueueArray(4);
        q.enqueue(10);
        System.out.println(q.getFront() + " " + q.getRear());
        q.enqueue(20);
        System.out.println(q.getFront() + " " + q.getRear());
        q.enqueue(30);
        System.out.println(q.getFront() + " " + q.getRear());
        q.enqueue(40);
        System.out.println(q.getFront() + " " + q.getRear());
        q.dequeue();
        System.out.println(q.getFront() + " " + q.getRear());
        q.dequeue();
        System.out.println(q.getFront() + " " + q.getRear());
        q.enqueue(50);
        System.out.println(q.getFront() + " " + q.getRear());
    }
}