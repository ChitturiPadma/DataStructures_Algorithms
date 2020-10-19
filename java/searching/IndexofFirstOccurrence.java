package com.expedia.demos.ds.searching;

public class IndexofFirstOccurrence {

    public static void main(String[] args)
    {
        int[] arr = {5, 10, 10, 15, 20, 20, 20,30};
        int n = arr.length;
        int high = n-1;
        int low = 0;

        int searchEle = 20;
        boolean elementFound = false;

        int index = 0 ;


// O(n) complexity
        while(low <= high)
        {
            int mid = (low+ high)/2;
            if(arr[mid] == searchEle )
            {
                if(arr[mid-1] == searchEle)
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

            else if(arr[mid] > searchEle)
            {
                high = mid;
            }

            else
            {
                low = mid+1;
            }
        }

        if(elementFound)
            System.out.println("Element Found at index: " + index);
        else
            System.out.println("Element not Found");

    }
}
