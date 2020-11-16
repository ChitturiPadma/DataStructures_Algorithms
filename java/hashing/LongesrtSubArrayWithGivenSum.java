package com.expedia.java.demos.ds.hashing;

import org.apache.commons.collections.map.HashedMap;

import java.util.HashMap;

public class
LongesrtSubArrayWithGivenSum {
    public static void main(String[] args)
    {
      //  int[] arr = {8, 3, 1, 5, -6, 6, 2, 2};
        int[] arr = {2, 3, 1};
        int n = arr.length;
        int prefixSum = 0;
        int res = 0;
        int sum = 5;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0;i<n;i++)
        {
            prefixSum += arr[i];
            if(prefixSum == sum)
                res = i+1;

            if(!hashMap.containsKey(prefixSum))
                hashMap.put(prefixSum, i);

            if(hashMap.containsKey(prefixSum - sum))
                res = Math.max(res, i - hashMap.get(prefixSum-sum));
        }

        System.out.println("Longest SubArray With Sum:" + sum + " is: " + res );
    }
}
