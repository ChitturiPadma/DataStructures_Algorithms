package com.expedia.java.demos.ds.stack;


class TwoStacks {

    int[] arr;
    int capacity;
    int top1, top2;

    TwoStacks(int n) {
        arr = new int[n];
        capacity = n;
        top1 = -1;
        top2 = capacity;
    }

    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
            System.out.println("Pushed element into Stack1: " + x);
        } else {
            System.out.println("Stack Overflow !");
        }
    }

    public void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
            System.out.println("Pushed Element into Stack2 : " + x);
        } else {
            System.out.println("Stack Overflow !");
        }
    }

    public void pop1() {
        if (top1 >= 0) {
            int poppedEle = arr[top1];
            top1--;
            System.out.println("Popped Element from Stack1 : " + poppedEle);

        } else
            System.out.println("Stack Underflow !");
    }

    public void pop2() {
        if (top2 < capacity) {
            int poppedEle = arr[top2];
            top2++;
            System.out.println("Popped Element from Stack2 : " + poppedEle);
        } else
            System.out.println("Stack Underflow !");
    }

    public void display()
    {
        for(int ele: arr)
            System.out.print(ele + ",");
    }
}
public class TwoStacks_Array {

    public static void main(String[] args)
    {

        TwoStacks twoStacks = new TwoStacks(8);

        twoStacks.push1(10);
        twoStacks.push2(20);

        twoStacks.push1(5);
        twoStacks.push2(50);

        twoStacks.pop1();

        twoStacks.push2(19);
        twoStacks.push2(28);
        twoStacks.push2(4);

        twoStacks.push1(99);
        twoStacks.push1(9);
        twoStacks.push1(100);

        twoStacks.display();
    }




}
