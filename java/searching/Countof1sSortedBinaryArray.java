package com.expedia.demos.ds.searching;

public class Countof1sSortedBinaryArray {

    public static void main(String[] args)
    {
        int[] arr = {0,0,0,1};
        int n = arr.length;
        int high = n -1;
        int low = 0;

        boolean elementFound = false;
        int index = -1;


        //Count of 1s in binary sorted array is difference between length of array and index of first occurrence of 1
        while(low <= high)
        {
            int mid = (low + high)/2;

            if(arr[mid] == 1)
            {
                if(arr[mid-1] == 1)
                {
                    high = mid;
                }
                else
                {
                    elementFound = true;
                    index = mid;
                    break;
                }
            }

            else if (arr[mid] > 1)
            {
                high = mid;
            }
            else
              low = mid +1;
        }

        if(elementFound)
        System.out.println("No.of 1s : " + (n - index));
        else
            System.out.println("No.of 1s : " + 0 );
    }
}
