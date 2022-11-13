package com.beyza;

import java.util.Iterator;

public class ArrayBasedStack<T> implements Stack<T> {

    private T container[];
    private int top;
    private final static int DEFAULT_SIZE = 10;

    public ArrayBasedStack ()
    {
        this(DEFAULT_SIZE);
    }

    public ArrayBasedStack (int initSize)
    {
        container = (T[]) new Object [initSize];
        top = -1;
    }

    public T getTop()
    {
        if (top == -1)
            return null;
        return container[top];
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return false;
    }


    public T pop()
    {
        if (top == -1)
            return null;

        T itm = container[top];
        container[top--] = null;

        if(top > 0 && top == container.length / 4)
            resize (container.length/2);

        return itm;
    }

    @Override
    public Object peek() {
        return null;
    }


    public void push(T itm)
    {
        if (top == container.length - 1)
            resize(2 * container.length);

        container[++top] = itm;
    }

    public int size()
    {
        return (top + 1);
    }

    private void resize (int newSize)
    {
        T t[] = (T[]) new Object[newSize];
        for (int i = 0; i <= top; i++)
            t[i] = container[i];
        container = t;
    }

    public Iterator<T> iterator()
    {
        return new ArrayStackIterator();
    }

    private class ArrayStackIterator implements Iterator <T>
    {
        private int i = top;

        public boolean hasNext()
        {
            return (i > -1);
        }

        public T next()
        {
            return container[i--];
        }

        public void remove()
        {
            // not needed
        }
    }


}