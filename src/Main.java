



public class Main {

    public static void main(String[] args) {
        exampleBinTree();
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
}

