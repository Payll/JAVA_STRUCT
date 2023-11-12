public class myBinTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public void add(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            return current;
        }

        return current;
    }

    public boolean containsNode(int data) {
        return containsNodeRecursive(root, data);
    }

    private boolean containsNodeRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }

        if (data == current.data) {
            return true;
        }

        return data < current.data
            ? containsNodeRecursive(current.left, data)
            : containsNodeRecursive(current.right, data);
    }

    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private Node deleteRecursive(Node current, int data) {
        if (current == null) {
            return null;
        }

        if (data == current.data) {

        }

        if (data < current.data) {
            current.left = deleteRecursive(current.left, data);
            return current;
        }

        current.right = deleteRecursive(current.right, data);
        return current;
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }


    // toString() method with representation of the tree
    public String toString() {
        return toStringRecursive(root, 0);
    }

    private String toStringRecursive(Node current, int level) {
        String result = "";
        if (current != null) {
            result += toStringRecursive(current.right, level + 1);
            for (int i = 0; i < level; i++) {
                result += "    ";
            }
            result += current.data + "\n";
            result += toStringRecursive(current.left, level + 1);
        }
        return result;
    }
}
