public class myTrie {
    static class Node {
        char data;
        Node[] children;
        boolean isEndOfWord;

        Node(char data) {
            this.data = data;
            this.children = new Node[26];
            this.isEndOfWord = false;
        }
    }

    Node root;

    public myTrie() {
        this.root = new Node(' ');
    }

    public void insert(String word) {
        Node current = this.root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';  //convert char to index
            if (current.children[index] == null) {
                current.children[index] = new Node(c); //create new node of children if not exist
            }
            current = current.children[index];//move to next node
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        Node current = this.root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (current.children[index] == null) { //if children corresponding of the char not exist, return false
                return false;
            }
            current = current.children[index];
        }
        return current.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        Node current = this.root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int index = c - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    public void delete(String word) {
        Node current = this.root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (current.children[index] == null) {
                return;
            }
            current = current.children[index];
        }
        current.isEndOfWord = false;
    }

    public String toString() {
        return "myTrie";
    }

}
