public class myDynamicArray {
    private int[] arr;
    private int size;

    public myDynamicArray() {
        arr = new int[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void pushBack(int value) {
        if (size == arr.length) {
            int[] temp = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[size] = value;
        size++;
    }

    public void push(int value) {
        if (size == arr.length) {
            int[] temp = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = value;
        size++;
    }

    public int pop() {
        int temp = arr[0];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return temp;
    }

    public int popBack() {
        int temp = arr[size - 1];
        size--;
        return temp;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        arr[index] = value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public void insert(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == arr.length) {
            int[] temp = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        size++;
    }


    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += arr[i] + " ";
        }
        return result;
    }

}
