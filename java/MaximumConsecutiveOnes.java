package com.expedia.demos.ds;

public class MaximumConsecutiveOnes {

    public static void main(String[] args)
    {
        int[] arr = {0, 1,1,1,0,1,1};
        int n = arr.length;
        int curr = 0, res =0 ;

        for(int i=0; i< n ;i++)
        {
            if(arr[i] == 0)
            {
                curr = 0; }
                else
            {
                curr +=1;
                res = Math.max(res, curr);

            }
        }

        System.out.println("Max Consecutive Ones: " + res);
    }
}
