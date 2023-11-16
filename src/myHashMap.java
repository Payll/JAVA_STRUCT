public class myHashMap {
/*    private class myHashMapNode {
        public int key;
        public int value;
        public myHashMapNode next;
        public myHashMapNode(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    private int size;
    private int capacity;
    private myLinkedList[] buckets;
    private int hash(int key) {
        return key % capacity;
    }
    public myHashMap() {
        size = 0;
        capacity = 10;
        buckets = new myLinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new myLinkedList();
        }
    }
    public void put(int key, int value) {
        int index = hash(key);
        myHashMapNode currentNode = buckets[index];
        while (currentNode != null) {
            if (currentNode.key == key) {
                currentNode.value = value;
                return;
            }
            currentNode = currentNode.next;
        }
        buckets[index].pushBack(key, value);
        size++;
    }
    public int get(int key) {
        int index = hash(key);
        myHashMapNode currentNode = buckets[index].head;
        while (currentNode != null) {
            if (currentNode.key == key) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }
    public void remove(int key) {
        int index = hash(key);
        myHashMapNode currentNode = buckets[index].head;
        while (currentNode != null) {
            if (currentNode.key == key) {
                buckets[index].remove(currentNode);
                size--;
                return;
            }*/
}
