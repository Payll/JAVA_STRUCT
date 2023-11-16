import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class testBinTree {
    @Test
    public void testAdd() {
        myBinTree tree = new myBinTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(13);
        tree.add(17);


        assertEquals(true, tree.containsNode(10));
        assertEquals(true, tree.containsNode(5));
        assertEquals(true, tree.containsNode(15));
        assertEquals(true, tree.containsNode(3));
        assertEquals(true, tree.containsNode(7));
        assertEquals(true, tree.containsNode(13));
        assertEquals(true, tree.containsNode(17));
        assertEquals(false, tree.containsNode(1));
    }
    public void testAdd2() {
        myBinTree tree = new myBinTree();
        tree.add(15);
        tree.add(15);
        assertEquals(true, tree.containsNode(15));
    }


    @Test
    public void testDelete() {
        myBinTree tree = new myBinTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(13);
        tree.add(17);
        tree.delete(10);
        assertEquals(false, tree.containsNode(10));
    }
    @Test
    public void testDelete2() {
        myBinTree tree = new myBinTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(13);
        tree.add(17);
        tree.delete(5);
        assertEquals(false, tree.containsNode(5));

    }
    @Test
    public void testDelete3() {
        myBinTree tree = new myBinTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(13);
        tree.add(17);
        tree.delete(15);
        assertEquals(false, tree.containsNode(15));
    }
}
