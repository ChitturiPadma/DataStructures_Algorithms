package com.expedia.demos.ds.hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("hello");
        hashSet.add("good");


        System.out.println(hashSet);

        System.out.println(hashSet.contains("hello"));

        Iterator<String> iter = hashSet.iterator();

        // Order is not maintained while traversing the HashSet
        while(iter.hasNext())
            System.out.print(iter.next() + " ");
    }
}
