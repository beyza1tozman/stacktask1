package com.beyza;


    public interface Stack<T> {
        public boolean isEmpty();
        public boolean isFull();
        //  Adds one element to the top of this stack
        public void push(T itm);

        //  Removes and returns the top element from this stack
        public Object pop();

        //  Returns without removing the top element of this stack
        public Object peek();

//  Optional Returns a string representation of this stack
//public String toString( );
    }

