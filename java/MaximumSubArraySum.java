package com.expedia.demos.ds;

public class MaximumSubArraySum {

    public static void main(String[] args)
    {
        int[] arr = {1, -2, 3, -1, 2};  //{1, -2, 3, -1, 2};
        int n = arr.length;

        int res = arr[0];
        for(int i = 0; i< n; i++)
        {
            int curr = 0;

            for(int j = i; j< n ; j++)
            {
                curr = curr + arr[j];
                res = Math.max(res, curr);
            }

        }

        System.out.println("Maximum SubArray Sum: " + res);


        // Efficient Method

        int maxEnding = arr[0];
        int result = arr[0];

        /*
         O(n), For every element, find the maximum of  sum with its preceeding value and the current element.
         Update the result variable based on current max and previous max.
          */
        for(int i =1 ; i< n; i++)
        {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            result = Math.max(res, maxEnding);


        }

        System.out.println("Final Maximum SubArray Sum: " + result);
    }
}
