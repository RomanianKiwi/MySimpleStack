package dcll.fcui.MySimpleStack;

import java.util.Stack;
import java.util.EmptyStackException;

/**
 * Created by Kiwi on 28/02/2015.
 */

/*
 * Un commentaire répondant à l'exigence #3
 */
public class SimpleStackImpl implements SimpleStack {
    Stack<Object> wrappedStack = new Stack<Object>();

    @Override
    public boolean isEmpty() {
        return wrappedStack.empty();
    }

    @Override
    public int getSize() {
        return wrappedStack.size();
    }

    @Override
    public void push(Item item) {
        wrappedStack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }
}
