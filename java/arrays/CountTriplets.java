package com.expedia.java.demos.ds.arrays;

import java.util.Arrays;

public class CountTriplets {

    public static void main(String[] args)
    {
       // int[] arr = {1, 5, 3, 2};

       // int[] arr = {1, 15, 4, 3, 19};

        int[] arr = {2, 10, 4, 12, 8};
        int n = arr.length;
        Arrays.sort(arr);

        int sum;

        for(int i = n-1; i>0;i--)
        {
            sum = arr[i];

            int j = 0;
            int k = i-1;
            while(j < k)
            {
                if(arr[j] + arr[k] < sum )
                    j++;
                else   {
                    if(arr[j] + arr[k] == sum)
                        System.out.println("Triplet : " + arr[j] + "," + arr[k] + "," + sum );
                    j++;
                    k--;
                }
            }
        }
    }
}
