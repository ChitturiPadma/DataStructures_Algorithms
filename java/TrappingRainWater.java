package com.expedia.demos.ds;

public class TrappingRainWater {

    public static void main(String[] args)
    {

        int[] arr = {3, 0, 2, 0, 4};
        int n = arr.length;

        int left =0 , right = 0;
        int res = 0;
        for(int i=1; i<n-1;i++)
        {
            left = arr[i];
            for(int j=0;j<i;j++)
                left = Math.max(left, arr[j]);

            right = arr[i];
            for(int j=i+1; j<n; j++)
                right = Math.max(right, arr[j]);

            res += Math.min(left, right) - arr[i];

        }

        System.out.println("Total units of water trapped: " + res);

    }
}
