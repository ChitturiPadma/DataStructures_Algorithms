package com.expedia.demos.ds;

public class LongestEvenOddSubArray {

    public static void main(String[] args)
    {
        int[] arr =  {1, 2, 7, 3, 4};//{10, 12, 14, 7, 8};//{7, 12, 10, 4};
        int n = arr.length;

        String flag  = "N";

        if(arr[0] % 2 == 0)
            flag = "E";
        else
            flag = "O";

        int count = 1;
        int res =1 ;

        for(int i = 1; i < n ; i++)
        {
            if(arr[i] % 2 == 0 && flag == "O")
            {
                flag = "E";
                count += 1;
                res = Math.max(res, count);
            }

            else if(arr[i] % 2 == 1 && flag == "E")
            {
                flag = "O";
                count += 1;
                res = Math.max(res, count);
            }

            else
            {
                count = 1;

                if(arr[i] % 2 == 0)
                    flag = "E";

                else
                    flag = "O";
            }
        }

        System.out.println("Longest Even Odd subarray: " + res);

    }
}
