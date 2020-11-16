package com.expedia.java.demos.ds.hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {
    public static void main(String[] args)
    {
        int[] arr = {5, 8, 6, 13, 3 , -1};
        int sum = 22;
        // O(n) solution is based on prefix sum and hashing

        int n = arr.length;
        int[] prefixSumArr = new int[n];
        boolean isFound = false;
        prefixSumArr[0] = arr[0];

        for(int i = 1; i<n;i++)
            prefixSumArr[i] = arr[i] + prefixSumArr[i-1];

        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i = 0; i< n ; i++)
        {
            if(hashSet.contains(prefixSumArr[i] - sum))
            {
                isFound = true;
                break;
            }
            else
            {
                hashSet.add(prefixSumArr[i]);
            }
        }

        if(isFound)
            System.out.println("Sub Array with given sum is found");
        else
            System.out.println("Sub Array with given Sum is not found");



    }
}
