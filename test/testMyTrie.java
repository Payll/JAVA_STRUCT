import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testMyTrie {
    @Test
    public void testInsert() {
        myTrie trie = new myTrie();
        trie.insert("hello");
        trie.insert("world");
        assertEquals(true, trie.search("hello"));
        assertEquals(true, trie.search("world"));
        assertEquals(false, trie.search("hell"));
        assertEquals(false, trie.search("wor"));
    }

    @Test
    public void testInsert2() {
        myTrie trie = new myTrie();
        trie.insert("hello");
        trie.insert("hello");
        assertEquals(true, trie.search("hello"));
    }
    @Test
    public void testSearch(){
        myTrie trie = new myTrie();
        trie.insert("hello");
        trie.insert("world");
        assertEquals(true, trie.search("hello"));
        assertEquals(true, trie.search("world"));
        assertEquals(false, trie.search("hell"));
        assertEquals(false, trie.search("wor"));
    }
    @Test
    public void testSearch2(){
        myTrie trie = new myTrie();
        trie.insert("hello");
        assertEquals(false, trie.search("hellp"));
    }

    @Test
    public void testDelete() {
        myTrie trie = new myTrie();
        trie.insert("hello");
        trie.insert("world");
        trie.delete("hello");
        assertEquals(false, trie.search("hello"));
        assertEquals(true, trie.search("world"));
    }

    @Test
    public void testDelete2() {
        myTrie trie = new myTrie();
        trie.insert("hello");
        trie.insert("world");
        trie.delete("hell");
        assertEquals(true, trie.search("hello"));
        assertEquals(true, trie.search("world"));
    }

    @Test
    public void testDelete3() {
        myTrie trie = new myTrie();
        trie.insert("hello");
        trie.insert("hey");
        trie.delete("hello");
        assertEquals(false, trie.search("hello"));
        assertEquals(true, trie.search("hey"));
    }

    @Test
    public void testStartsWith(){
        myTrie trie = new myTrie();
        trie.insert("hello");
        trie.insert("world");
        assertEquals(true, trie.startsWith("hel"));
        assertEquals(true, trie.startsWith("wor"));
        assertEquals(false, trie.startsWith("help"));
        assertEquals(false, trie.startsWith("worp"));
    }
}
