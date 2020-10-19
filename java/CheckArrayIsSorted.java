package com.expedia.demos.ds;

public class CheckArrayIsSorted {

    public static void main(String[] args)
    {
        int[] arr =  {10, 20, 20, 30, 50};//{100, 20, 10, 200};

        //System.out.println("Length of the Array:" + arr.length);

      //  System.out.println("Check if Array is Sorted in Non-Decreasing Order");

        int arrLen = arr.length;

        int j = arrLen-1;
        int i = 0;

        boolean isSorted = false;

        // Efficient method in linear time O(n).
        while(i <j)
        {
            // For first element, check if the first element is less than or equal to last element
            if(i ==0  )
            {
                if(arr[i] <= arr[j])
                {
                    isSorted = true;
                }
                else
                {
                    isSorted = false;
                    break;
                }
            }

            /*
            From 2nd element onwards, 2nd element should be greater than or equal to  1st element and 2nd element should be less than or equal to last
            element
             */
            else if(i !=0)
            {
                if(arr[i] >= arr[i-1] && arr[i] <= arr[j])
                {
                    isSorted = true;
                }

                else
                {
                    isSorted = false;
                    break;

                }
            }

            i++;
        }

        if(isSorted)
            System.out.println("Array is Sorted ");
        else
            System.out.println("Array is not Sorted ");


        // Much more efficient method
        for(int k = 1; k < arrLen; i++)
        {
            if(arr[i] < arr[i-1])
            {
                isSorted = false;
                break;

            }
        }

    }
}
