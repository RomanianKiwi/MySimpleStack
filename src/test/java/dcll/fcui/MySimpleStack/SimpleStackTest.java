package dcll.fcui.MySimpleStack;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.EmptyStackException;

/**
 * Created by Kiwi on 28/02/2015.
 */
public class SimpleStackTest {
    @Test
    public void testCreateEmptyStack() { // Test case

        // Code under test
        SimpleStack simpleStack = new SimpleStackImpl();

        // Assertions (oracle)
        assertTrue("A new simpleStack should be empty", simpleStack.isEmpty());
        assertEquals("A new simpleStack has no element", 0, simpleStack.getSize());
    }

    @Test
    public void testPush() throws EmptyStackException {

        // Setup the "state of the world"
        SimpleStack simpleStack = new SimpleStackImpl();
        Item item = new Item(0);

        // Code under test
        simpleStack.push(item);

        // assertions (oracle)
        assertFalse("The simpleStack must be not empty", simpleStack.isEmpty());
        assertEquals("The simpleStack contains 1 item", 1, simpleStack.getSize());
        assertSame("The pushed item is on top of the simpleStack", item, simpleStack.peek());
    }

    @Test(expected = EmptyStackException.class)
    public void testPopOnEmptyStack() throws EmptyStackException {
        // Setup the "state of the world"
        SimpleStack simpleStack = new SimpleStackImpl();

        // Code under test
        simpleStack.pop(); // should throws an EmptyStackException.

        // assertions (oracle)
        assertTrue("The simpleStack must be empty", simpleStack.isEmpty());
        assertEquals("The simpleStack contains 0 item", 0, simpleStack.getSize());
    }

//    @Test(expected = EmptyStackException.class)
//    public void testPeek() throws EmptyStackException {
//        // Setup the "state of the world"
//        SimpleStack simpleStack = new SimpleStackImpl();
//        Item item1 = new Item(0);
//        Item item2 = new Item(3.14);
//        Item item3 = new Item("PCS");
//        simpleStack.push(item1);
//        simpleStack.push(item2);
//        simpleStack.push(item3);
//        int size = simpleStack.getSize();

        // Code under test
        //Item itemRet = simpleStack.peek();

        // assertions (oracle)
//        assertEquals("The simpleStack have the same size", size, simpleStack.getSize());
//        assertEquals("The item peeked is the same", itemRet, item3);
//    }

}
