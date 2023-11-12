import org.junit.Test;
import static org.junit.Assert.*;

public class testMyQueue {

    @Test
    public void testEnqueue() {
        myQueue queue = new myQueue(3);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(3, queue.size());

    }

    @Test
    public void testDequeue() {
        myQueue queue = new myQueue(3);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
    }

    @Test
    public void testMultipleEnqueueDequeue() {
        myQueue queue = new myQueue(3);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        assertEquals(4, queue.dequeue());
        assertEquals(5, queue.dequeue());
        assertEquals(6, queue.dequeue());
    }

    @Test
    public void testSizeEmpty() {
        myQueue queue = new myQueue(3);
        assertEquals(0, queue.size());
    }

    @Test
    public void testSizeWithEnqueueAndDequeue() {
        myQueue queue = new myQueue(3);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(3, queue.size());

        queue.dequeue();
        queue.dequeue();

        assertEquals(1, queue.size());

        queue.enqueue(4);
        queue.enqueue(5);

        assertEquals(3, queue.size());
    }

    @Test
    public void testIsFull() {
        myQueue queue = new myQueue(3);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertTrue(queue.isFull());
    }

    @Test
    public void testIsEmpty() {
        myQueue queue = new myQueue(3);

        assertTrue(queue.isEmpty());
    }
}
