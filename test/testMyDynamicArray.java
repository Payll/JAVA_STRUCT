import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class testMyDynamicArray {
    @Test
    public void testPush() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        assertEquals(3, list.size());
    }

    @Test
    public void testPush2() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        assertEquals(3, list.get(0));
    }

    @Test
    public void testPushBack() {
        myDynamicArray list = new myDynamicArray();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        assertEquals(3, list.size());
    }

    @Test
    public void testPushBack2() {
        myDynamicArray list = new myDynamicArray();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        assertEquals(3, list.get(2));
    }

    @Test
    public void testPushBackWithResize() {
        myDynamicArray list = new myDynamicArray();
        for (int i = 0; i < 100; i++) {
            list.pushBack(i);
        }
        assertEquals(100, list.size());
    }

    @Test
    public void testPop() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        assertEquals(3, list.pop());
        assertEquals(2, list.size());
    }

    @Test
    public void testPopBack() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        assertEquals(1, list.popBack());
        assertEquals(2, list.size());
    }

    @Test
    public void testGet() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        assertEquals(2, list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet2() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        list.get(3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet3() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        list.get(-1);
    }


    @Test
    public void testSet() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        list.set(1, 4);
        assertEquals(3, list.size());
        assertEquals(4, list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet2() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        list.set(3, 4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet3() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        list.set(-1, 4);
    }

    @Test
    public void testRemove() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        list.remove(1);
        assertEquals(2, list.size());
        assertEquals(1, list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove2() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        list.remove(3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove3() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        list.remove(-1);
    }

    @Test
    public void testCapacityIncrease() {
        myDynamicArray list = new myDynamicArray();
        for (int i = 0; i < 100; i++) {
            list.push(i);
        }
        assertEquals(100, list.size());
    }

    @Test
    public void testInsert() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        list.insert(1, 4);
        assertEquals(4, list.size());
        assertEquals(4, list.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsert2() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        list.insert(3, 4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsert3() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        list.push(2);
        list.push(3);
        list.insert(-1, 4);
    }

    @Test
    public void testInsertWithResize() {
        myDynamicArray list = new myDynamicArray();
        list.push(1);
        for (int i = 0; i < 100; i++) {
            list.insert(0, i);
        }
        assertEquals(101, list.size());
    }
}
