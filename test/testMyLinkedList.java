import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class testMyLinkedList {

    @Test
    public void testConstructor() {
        myLinkedList list = new myLinkedList();
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    public void testConstructor2() {
        myLinkedList list = new myLinkedList(1);
        assertEquals(1, list.getHead().getData());
        assertEquals(1, list.getTail().getData());
    }

    @Test
    public void testConstructor3() {
        int[] data = {1, 2, 3};
        myLinkedList list = new myLinkedList(data);
        assertEquals(1, list.getHead().getData());
        assertEquals(2, list.getHead().next.getData());
        assertEquals(3, list.getTail().getData());
    }

    @Test
    public void testPushFront() {
        myLinkedList list = new myLinkedList();
        list.pushFront(1);
        assertEquals(1, list.getHead().getData());
        assertEquals(1, list.getTail().getData());
    }

    @Test
    public void testPushFront2() {
        myLinkedList list = new myLinkedList(1);
        list.pushFront(2);
        assertEquals(2, list.getHead().getData());
        assertEquals(1, list.getTail().getData());
    }

    @Test
    public void testPushFront3() {
        myLinkedList list = new myLinkedList(1);
        list.pushFront(2);
        list.pushFront(3);
        assertEquals(3, list.getHead().getData());
        assertEquals(1, list.getTail().getData());
    }

    @Test
    public void testPushBack() {
        myLinkedList list = new myLinkedList();
        list.pushBack(1);
        assertEquals(1, list.getHead().getData());
        assertEquals(1, list.getTail().getData());
    }

    @Test
    public void testPushBack2() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        assertEquals(1, list.getHead().getData());
        assertEquals(2, list.getTail().getData());
    }

    @Test
    public void testPushBack3() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        assertEquals(1, list.getHead().getData());
        assertEquals(3, list.getTail().getData());
    }

    @Test
    public void testPopFront() {
        myLinkedList list = new myLinkedList(1);
        list.popFront();
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    public void testPopFront2() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.popFront();
        assertEquals(2, list.getHead().getData());
        assertEquals(2, list.getTail().getData());
    }

    @Test
    public void testPopFront3() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.popFront();
        assertEquals(2, list.getHead().getData());
        assertEquals(3, list.getTail().getData());
    }

    @Test
    public void testPopBack() {
        myLinkedList list = new myLinkedList(1);
        list.popBack();
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    public void testPopBack2() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.popBack();
        assertEquals(1, list.getHead().getData());
        assertEquals(1, list.getTail().getData());
    }

    @Test
    public void testPopBack3() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.popBack();
        assertEquals(1, list.getHead().getData());
        assertEquals(2, list.getTail().getData());
    }

    @Test
    public void testRemove() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.remove(2);
        assertEquals(1, list.getHead().getData());
        assertEquals(2, list.getTail().getData());
    }

    @Test
    public void testRemove2() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.remove(0);
        assertEquals(2, list.getHead().getData());
        assertEquals(3, list.getTail().getData());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove3() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.remove(3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove4() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.remove(-1);
    }

    @Test
    public void testInsert() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.insert(4, 2);
        assertEquals(1, list.getHead().getData());
        assertEquals(2, list.getHead().next.getData());
        assertEquals(4, list.getHead().next.next.getData());
        assertEquals(3, list.getTail().getData());
    }

    @Test
    public void testInsert2() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.insert(4, 0);
        assertEquals(4, list.getHead().getData());
        assertEquals(1, list.getHead().next.getData());
        assertEquals(2, list.getHead().next.next.getData());
        assertEquals(3, list.getTail().getData());
    }

    @Test
    public void testInsert3() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.insert(4, 3);
        assertEquals(1, list.getHead().getData());
        assertEquals(2, list.getHead().next.getData());
        assertEquals(3, list.getHead().next.next.getData());
        assertEquals(4, list.getTail().getData());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsert4() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.insert(4, 4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsert5() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.insert(4, -1);
    }

    @Test
    public void testSize() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        assertEquals(3, list.size());
    }

    @Test
    public void testGet() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet2() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.get(3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet3() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.get(-1);
    }

    @Test
    public void testSet() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.set(4, 0);
        assertEquals(4, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testSet2() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.set(4, 1);
        assertEquals(1, list.get(0));
        assertEquals(4, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testSet3() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.set(4, 2);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(4, list.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet4() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.set(4, 3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet5() {
        myLinkedList list = new myLinkedList(1);
        list.pushBack(2);
        list.pushBack(3);
        list.set(4, -1);
    }
}