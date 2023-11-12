



public class Main {

    public static void main(String[] args) {
        // exampleBinTree();
        // exampleSet();
        exampleLinkedList();
    }

    static void exampleBinTree() {
        myBinTree tree = new myBinTree();
        // tree with 20 nodes
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(13);
        tree.add(17);
        tree.add(1);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        tree.add(12);
        tree.add(14);
        tree.add(16);
        tree.add(18);
        tree.add(0);
        tree.add(2);
        tree.add(9);
        tree.add(11);
        tree.add(19);

        System.out.println(tree);

        tree.traverseInOrder(tree.root);
        System.out.println();
        tree.traversePreOrder(tree.root);
        System.out.println();
        tree.traversePostOrder(tree.root);
    }

    static void exampleSet() {
        mySet set = new mySet(10);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set);
        System.out.println(set.contains(3));
        System.out.println(set.contains(6));
        System.out.println(set.contains(0));
    }

    static void exampleLinkedList() {
        myLinkedList list = new myLinkedList();

        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);

        System.out.println(list);
    }
}

