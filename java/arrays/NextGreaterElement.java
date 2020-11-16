package com.expedia.java.demos.ds.arrays;

import java.util.Iterator;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args)
    {
       int[] arr = {11, 13, 21,3};
       int n = arr.length;

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);



        int top = stack.peek();
    //    System.out.println(top);

       /* Iterator<Integer> stackElements = stack.iterator();
        while(stackElements.hasNext())
            System.out.println(stackElements.next());*/

        for(int i = 1; i< n ; i++)
        {
            if(arr[i] > stack.peek())
            {
                int poppedEle =  stack.pop();
                System.out.println(poppedEle + " -> " + arr[i]);
                stack.push(arr[i]);
            }

            else //if (arr[i] < stack.peek())
            {
                stack.push(arr[i]);
            }
        }

        Iterator<Integer> remainingStackEles = stack.iterator();
        while(remainingStackEles.hasNext())
            System.out.println(remainingStackEles.next() + " -> " + "-1");

     }
}
