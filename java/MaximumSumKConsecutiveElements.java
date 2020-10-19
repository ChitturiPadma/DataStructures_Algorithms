package com.expedia.demos.ds;

public class MaximumSumKConsecutiveElements {

    public static void main(String[] args)
    {
        int[] arr = {1, 8, 30, -5, 20, 7};
        int n = arr.length;

        int k = 3;

        int res = 0;
        int sum = 0;

        for(int i=0;i <n-2 ; i++)
        {
            int ele1 = arr[i];
            int ele2 = arr[i+1];
            int ele3 = arr[i+2];

            sum = ele1 + ele2 + ele3;

            res = Math.max(sum, res);
        }

        System.out.println("Maximum Sum of K Consecutive Elements: " + res);
    }
}
