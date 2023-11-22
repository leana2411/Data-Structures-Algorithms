public class CircularQueue {


    private int[] queue;
    private int front, rear, size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued to the queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int item = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return item;
    }public boolean isFull() {
        return size == capacity;
    }public boolean isEmpty() {
        return front == -1;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        System.out.println("Is queue full? " + queue.isFull());
    }
}