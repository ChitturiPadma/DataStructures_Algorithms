package com.expedia.java.demos.ds.stack;

import java.util.ArrayDeque;

public class StackArrayDequeue {

    public static void main(String[] args)
    {
        ArrayDeque<Integer> arrDequeue = new ArrayDeque<>();

        arrDequeue.push(10);
        arrDequeue.push(20);
        arrDequeue.push(30);

        System.out.println("Top Element: " + arrDequeue.peek());
        Integer poppedElement = arrDequeue.pop();
        Integer poppedElement2 = arrDequeue.pop();

        System.out.println("Popped Element: " + poppedElement2);

        System.out.println("Size of Stack: " + arrDequeue.size());

        System.out.println("Stack is Empty: " + arrDequeue.isEmpty());

        /*
           push, pop, isEmpty, peek -> O(1) complexity
           ArrayDequeue uses dynamic array internally
         */

    }
}
