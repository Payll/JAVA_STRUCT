public class myStack {
    private int size;
    private int[] data;

    public myStack(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
    }

    public void push(int value) {
        if (this.size == this.data.length) {
            throw new IllegalStateException("Stack is full");
        }
        this.data[this.size] = value;
        this.size++;
    }

    public int pop() {
        if (this.size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        this.size--;
        return this.data[this.size];
    }

    public int top() {
        if (this.size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.data[this.size - 1];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < this.size; i++) {
            result += this.data[i];
            if (i != this.size - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public void clear() {
        this.size = 0;
    }
}
