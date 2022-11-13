package com.beyza;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayBasedStack <Integer> s = new ArrayBasedStack<Integer>();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);

        System.out.println("Size of the stack: " + s.size());

        // iterate through stack
        System.out.println("Following items pushed to Stack as of now:");
        Iterator<Integer> itr = s.iterator();

        // hasNext() returns true if the stack has more elements
        while (itr.hasNext())
        {
            // next() returns the next element in the iteration
            System.out.println(itr.next());
        }

    }
}
