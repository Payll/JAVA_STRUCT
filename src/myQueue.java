public class myQueue { // Circular Queue
    private int arr[];
    private int front;
    private int rear;
    private int capacity;

    public myQueue(int capacity) {
        this.arr = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.capacity = capacity;
    }


    public void enqueue(int item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int item = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return item;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        if (rear >= front) {
            return rear - front + 1;
        } else {
            return capacity - front + rear + 1;
        }
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }


    public String toString() {
        String result = "[";
        for (int i = 0; i < capacity; i++) {
            result += arr[i] + ", ";
        }
        result += "]";
        return result;
    }

}
