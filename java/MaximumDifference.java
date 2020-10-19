package com.expedia.demos.ds;

public class MaximumDifference {

    public static void main(String[] args)
    {
        /*
          Problem: print maximum difference between pair of array elements: arr[j] and arr[i] such that j < i
         */
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        int n = arr.length;

        int res = arr[1] - arr[0];
        int minValue = arr[0];

        for(int j=1; j<n; j++)
        {
            res = max(res, arr[j]-minValue);
            minValue = min(minValue, arr[j]);
        }

        System.out.println("Maximum Difference: "  + res);

    }

    private static int max(int curr_res, int diff)
    {

        return ((curr_res > diff) ? curr_res :diff );
    }

    private static int min(int curr_min, int arrEle)
    {
         return ((curr_min < arrEle) ? curr_min : arrEle );
    }
}
