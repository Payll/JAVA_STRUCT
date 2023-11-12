import org.junit.Test;
import static org.junit.Assert.*;

public class testMySet {

    @Test
    public void testAdd() {
        mySet set = new mySet(3);

        set.add(1);
        set.add(2);
        set.add(3);

        assertEquals(3, set.size());
        assertEquals(1, set.get(0));
        assertEquals(2, set.get(1));
        assertEquals(3, set.get(2));
    }

    @Test
    public void testAddDuplicate() {
        mySet set = new mySet(5);

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);

        assertEquals(3, set.size());
        assertEquals(1, set.get(0));
        assertEquals(2, set.get(1));
        assertEquals(3, set.get(2));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddFull() {
        mySet set = new mySet(3);

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
    }

    @Test
    public void testRemove() {
        mySet set = new mySet(3);

        set.add(1);
        set.add(2);
        set.add(3);

        set.remove(2);

        assertEquals(2, set.size());
        assertEquals(1, set.get(0));
        assertEquals(3, set.get(1));
    }

    @Test
    public void testRemoveNonExistent() {
        mySet set = new mySet(3);

        set.add(1);
        set.add(2);
        set.add(3);

        set.remove(4);

        assertEquals(3, set.size());
        assertEquals(1, set.get(0));
        assertEquals(2, set.get(1));
        assertEquals(3, set.get(2));
    }

    @Test
    public void testContains() {
        mySet set = new mySet(3);

        set.add(1);
        set.add(2);
        set.add(3);

        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
        assertFalse(set.contains(4));
    }

    @Test
    public void testIsEmpty() {
        mySet set = new mySet(3);

        assertTrue(set.isEmpty());

        set.add(1);
        set.add(2);
        set.add(3);

        assertFalse(set.isEmpty());
    }

    @Test
    public void testClear() {
        mySet set = new mySet(3);

        set.add(1);
        set.add(2);
        set.add(3);

        set.clear();

        assertTrue(set.isEmpty());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        mySet set = new mySet(3);

        set.add(1);
        set.add(2);
        set.add(3);

        set.get(3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBoundsNegative() {
        mySet set = new mySet(3);

        set.add(1);
        set.add(2);
        set.add(3);

        set.get(-1);
    }

}
