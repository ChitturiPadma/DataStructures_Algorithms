package com.expedia.demos.ds;

public class LeftRotateArrayBy2Places {

    public static void main(String[] args)
    {
        int[] arr = {2, 1, 5, 10, 3, 5};
        int d = 2;

        int len = arr.length;
        for(int i = 0; i<d; i++)
        {
            int temp = arr[0];

            for(int j = 1; j< arr.length; j++)
            {
                arr[j-1] = arr[j];
            }

            arr[len-1] = temp;
        }

        System.out.println("Left Rotated Array");
        for(int i = 0; i< len; i++)
            System.out.println(arr[i]);
     }



}
