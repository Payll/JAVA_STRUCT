import org.junit.Test;

import static org.junit.Assert.*;

public class testMyStack {
    @Test
    public void testPush() {
        myStack stack = new myStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.size());
        assertEquals(3, stack.top());
    }

    @Test
    public void testStackUnstack() {
        myStack stack = new myStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test(expected = IllegalStateException.class)
    public void testPushFull() {
        myStack stack = new myStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
    }


    @Test(expected = IllegalStateException.class)
    public void testPopEmpty() {
        myStack stack = new myStack(3);
        stack.pop();
    }

    @Test(expected = IllegalStateException.class)
    public void testTopEmpty() {
        myStack stack = new myStack(3);
        stack.top();
    }

    @Test
    public void testSize() {
        myStack stack = new myStack(3);
        assertEquals(0, stack.size());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.size());
    }

    @Test
    public void testIsEmpty() {
        myStack stack = new myStack(3);
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testClear() {
        myStack stack = new myStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.clear();
        assertTrue(stack.isEmpty());
    }

}
