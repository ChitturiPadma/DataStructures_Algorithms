package com.expedia.java.demos.ds.hashing;

import java.util.HashSet;

public class CountDistinctElement_InEveryWidnow {

    public static void main(String[] args)
    {
        int[] arr = {10, 20, 20,10, 30, 40, 10};
        int n = arr.length;
        int k = 4;
        int n_windows= n-k+1;
        int startIndex = -1;
        int endIndex = 0;

        HashSet<Integer> hashSet = new HashSet<>();

        for(int window =0;window < n_windows; window++ )
        {
            startIndex++;
            endIndex = startIndex + k - 1;
            for(int i = startIndex;i<=endIndex;i++)
            {
               hashSet.add(arr[i]);
            }
            int distinctEles = hashSet.size();
            System.out.print(distinctEles +",");
            hashSet.clear();
            //for(; i<j; i++)
        }
    }
}
