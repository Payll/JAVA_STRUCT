public class mySet {
    private int[] set;
    private int size;

    public mySet(int capacity) {
        this.set = new int[capacity];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == this.set.length) {
            throw new IllegalStateException("Set is full");
        }

        if (!this.contains(value)) {
            this.set[this.size] = value;
            this.size++;
        }
    }

    public void remove(int value) {
        if (!this.contains(value)) {
            return;
        }

        int index = -1;
        for (int i = 0; i < this.size; i++) {
            if (this.set[i] == value) {
                index = i;
                break;
            }
        }

        for (int i = index; i < this.size - 1; i++) {
            this.set[i] = this.set[i + 1];
        }

        this.size--;
    }

    public boolean contains(int value) {
        for (int i = 0; i < this.size; i++) {
            if (this.set[i] == value) {
                return true;
            }
        }

        return false;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public String toString() {
        String result = "{";
        for (int i = 0; i < this.size; i++) {
            result += this.set[i];
            if (i != this.size - 1) {
                result += ", ";
            }
        }
        result += "}";
        return result;
    }

    public void clear() {
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        return this.set[index];
    }

}
