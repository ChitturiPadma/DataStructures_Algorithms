package com.expedia.demos.ds;

public class RemoveDupsInSortedArray {

    public static void main(String[] args)
    {
       // int[] arr = {2, 5, 5, 10, 10, 10, 15};
        int[] arr = {2, 2, 5,  10, 10, 10,  15};
        int len = arr.length;

        int res = 0;


        for(int i = 1; i<len; i++)
        {
            if(arr[i] != arr[res] )
            {
                if(res+1 != i ) {
                    arr[res + 1] = arr[res + 1] + arr[i];
                    arr[i] = arr[res + 1] - arr[i];
                    arr[res + 1] = arr[res + 1] - arr[i];

                    res++;
                }
                else
                {
                    res++;
                }
            }

        }

        for(int i =1;i<len; i++)
        {

            if(arr[i-1] != arr[i])
                System.out.print(arr[i-1] + ",");
        }

        System.out.println("#Distincts:" +  (res+1));
    }
}
