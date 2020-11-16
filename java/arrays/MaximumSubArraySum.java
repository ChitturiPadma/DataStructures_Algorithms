package com.expedia.java.demos.ds.arrays;

public class MaximumSubArraySum {

    public static void main(String[] args)
    {
        //int[] arr = {1, -2, 3, -1, 2};
        int[] arr ={2,3,9, 8, 15, 10, -40};
        // Efficient Method

        int n = arr.length;
        int maxEnding = arr[0];
        int result = arr[0];

        int start = 0;
        int end = 0 ;

        /*
         O(n), For every element, find the maximum of  sum with its preceeding value and the current element.
         Update the result variable based on current max and previous max.
          */
        for(int i =1 ; i< n; i++)
        {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            result = Math.max(result, maxEnding);
        }

        System.out.println("Final Maximum SubArray Sum: " + result);
        System.out.println("Final Maximum SubArray Sum From Interview Evaluation: " + interviewEvaluation(arr));
    }

    public static int interviewEvaluation(int[] a)
    {
        int n = a.length;
        int max_sub_array_so_far = Integer.MIN_VALUE;
        int max_end = 0;

        for(int i = 0; i <n; i++){
            max_end+=a[i];

            if(max_sub_array_so_far< max_end){
                max_sub_array_so_far = max_end;
            }

            if(max_end < 0){
                max_end=0;

            }
        }
        return max_sub_array_so_far;
    }
}
