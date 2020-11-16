package com.expedia.java.demos.ds.hashing;

import java.util.HashMap;

public class LongestSubArrayWithEqualZeros_Ones {
    public static void main(String[] args)
    {
        int[] arr = {1, 0, 1, 1, 1, 0,0};
        int n = arr.length;
        int res = 0 ;
        // Naive solution - O(n2)
        for(int i=0;i<n;i++)
        {
            int c0 = 0;
            int c1= 0 ;
            for(int j=i;j<n; j++)
            {
                if(arr[j] == 0)
                    c0 ++;
                else c1++;
                if(c0 == c1)
                    res = Math.max(res, j-i+1);
            }
        }

        System.out.println("Longest SubArray with Equal Ones and Zeros: " + res);
        efficientMethod(arr, n);
    }
// This is same as problem with finding Longest SubArray with zero sum replacing 0 with -1
    public static void efficientMethod(int[] arr, int n)
    {
       int[] newArr = new int[n];
       for(int i = 0; i<n; i++)
       {
           if(arr[i] == 0)
               newArr[i] = -1;
           else
               newArr[i] = arr[i];
       }
       int sum = 0;
       int prefixSum = 0 ;
       int res = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
       for(int i = 0; i<n;i++)
       {
           prefixSum += newArr[i];
           if(prefixSum == sum)
               res = i+1;
           if(!hashMap.containsKey(prefixSum))
               hashMap.put(prefixSum, i);

           if(hashMap.containsKey(prefixSum - sum))
               res = Math.max(res, i - hashMap.get(prefixSum-sum));

       }

       System.out.println("Longest SubArray with Equal 0's and 1's: " + res);
    }
}
