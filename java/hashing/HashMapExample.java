package com.expedia.demos.ds.hashing;

import java.util.HashMap;
import java.util.Map;

/*
HashMap stores key value pairs
 */
public class HashMapExample {

    public static void main(String[] args)
    {

        // HashMap implements Map interface.
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("A", 10);
        hashMap.put("B", 20);
        hashMap.put("C", 30);
        hashMap.put("A", 5); // replaces 10 with 5 for key 'A'
        System.out.println(hashMap);

        System.out.println(hashMap.size());
        //hashMap.entrySet().

        for(Map.Entry<String, Integer> e : hashMap.entrySet())
        {
            System.out.println(e.getKey()+":" + e.getValue());
        }

        System.out.println(hashMap.containsKey("D"));
        Integer removedValue = hashMap.remove("C");
        System.out.println(removedValue);
        System.out.println(hashMap);

        /*
        put, remove, contains, get, isEmpty -> O(1)
         */


    }
}
