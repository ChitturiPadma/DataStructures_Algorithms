package com.expedia.java.demos.ds.arrays;

public class KadaneAlgorithm {

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,-2,5};
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        int start = 0;
        int end = 0;
        for(int i = 1; i<n;i++)
        {
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);

            if(res < maxEnding)
            {
                res = maxEnding;
                end = i;
            }

            //res = Math.max(maxEnding, res);
        }

        System.out.println("Maximum Sum: " + res);
        for(int i = start; i <=end; i++)
            System.out.print(arr[i] + ",");
    }
}
