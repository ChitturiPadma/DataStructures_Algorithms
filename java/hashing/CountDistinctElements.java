package com.expedia.demos.ds.hashing;

public class CountDistinctElements {

    public static void main(String[] args)
    {
        int[] arr = {15, 12, 13, 12, 13, 13, 13,14};
        int len  = arr.length;
        int[] hashtable = new int[len];

        int count = 0 ;

        for(int i = 0; i< len; i++)
        {
            int slot = arr[i] % len;

            if(hashtable[slot] == 0)
                hashtable[slot] += 1;
        }

        for(int i =0;i < len;i++)
            count += hashtable[i];

        System.out.println("Count of Distinct Elements: " + count);

    }

}
