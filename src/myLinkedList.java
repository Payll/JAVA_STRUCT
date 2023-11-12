public class myLinkedList {
    public static class myLinkedListNode {
        int data;
        myLinkedListNode next;

        public myLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public myLinkedListNode(int data, myLinkedListNode next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return this.data;
        }


        public String toString() {
            return Integer.toString(this.data);
        }
    }

    private myLinkedListNode head;
    private myLinkedListNode tail;

    private int size;


    public myLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public myLinkedList(int data) {
        this.head = new myLinkedListNode(data);
        this.tail = this.head;
        size++;
    }

    public myLinkedList(int[] data) {
        this.head = new myLinkedListNode(data[0]);
        this.tail = this.head;
        for (int i = 1; i < data.length; i++) {
            this.pushBack(data[i]);
        }
    }

    public myLinkedListNode getHead() {
        return this.head;
    }

    public myLinkedListNode getTail() {
        return this.tail;
    }

    public void pushFront(int data) {
        myLinkedListNode newNode = new myLinkedListNode(data, this.head);
        this.head = newNode;
        if (this.tail == null) {
            this.tail = newNode;
        }
        size++;
    }

    public void pushBack(int data) {
        myLinkedListNode newNode = new myLinkedListNode(data);
        if (this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        size++;
    }

    public void insert(int data, int index) {

        if (0 > index || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            this.pushFront(data);
        } else {
            myLinkedListNode newNode = new myLinkedListNode(data);
            myLinkedListNode currentNode = this.head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            if (newNode.next == null) {
                this.tail = newNode;
            }
        }
        size++;
    }

    public void popFront() {
        if (this.head == null) {
            return;
        }
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        size--;
    }

    public void popBack() {
        if (this.head == null) {
            return;
        }
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;
            return;
        }
        myLinkedListNode currentNode = this.head;
        while (currentNode.next != this.tail) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        this.tail = currentNode;
        size--;
    }

    public void remove(int index) {

        if (0 > index || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            this.popFront();
        } else {
            myLinkedListNode currentNode = this.head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
            if (currentNode.next == null) {
                this.tail = currentNode;
            }
        }
        size--;
    }

    public int get(int index) {

        if (0 > index || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        myLinkedListNode currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public void set(int data, int index) {

        if (0 > index || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        myLinkedListNode currentNode = this.head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.data = data;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String result = "[";
        myLinkedListNode currentNode = this.head;
        while (currentNode != null) {
            result += currentNode.data;
            if (currentNode.next != null) {
                result += ", ";
            }
            currentNode = currentNode.next;
        }
        result += "]";
        return result;
    }

}


