package com.expedia.java.demos.ds.arrays;

public class MaximumConsecutiveOnes {
    public static void main(String[] args)
    {
        int[] arr = {0, 1, 1, 1, 0, 1, 1};
        int res = 0;
        int curr = 0;
        int n = arr.length;

        for(int i=0; i<n;i++)
        {
            if(arr[i] == 0)
                curr =0;
            else
            {
                curr += 1;
                res = Math.max(res, curr);
            }
        }

        System.out.println("Maximum number of Consecutive Ones: " + res);
    }
}
