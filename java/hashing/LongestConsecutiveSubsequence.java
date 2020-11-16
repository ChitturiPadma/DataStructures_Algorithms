package com.expedia.java.demos.ds.hashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args)
    {
        int[] arr = {1, 9, 3, 4, 2, 20};

        //Method -1 Sorting
        int n = arr.length;
        int res =1 ;
        int currLength = 1;
        Arrays.sort(arr);

        // O(nlogn) - solution
        for(int i = 1; i< n ; i++)
        {
            if(arr[i]-arr[i-1] == 1)
                currLength +=1;
            else
            {
                currLength = 1;

            }
            res = Math.max(res, currLength);
        }

        System.out.println("Length of longest consecutive subsequence: " + res);

        efficientMethod(arr, n);
    }
    static void efficientMethod(int[] arr, int n)
    {
        int res = 0;
        int curr =0;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i<n;i++)
        {
            hashSet.add(arr[i]);
        }
        for(int i =0; i<n;i++)
        {
            if(hashSet.contains(arr[i] -1 ))
                curr = 1;
            while(hashSet.contains(arr[i] + curr))
                curr+=1 ;

            res = Math.max(res, curr);

        }

        System.out.println("Length of longest consecutive subsequence: O(n):  " + res);
    }
}
