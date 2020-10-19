package com.expedia.demos.ds.searching;

public class BinarySearch {

    public static void main(String[] args)
    {
        int[] arr = {10,20,30, 40, 50,60};

        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = (low+high)/2;

        boolean eleFound = false;

        int searchEle = 10;

        while(low <= high)
        {
            if(arr[mid] == searchEle)

            {
                eleFound = true;
                break;

            }

            else if(searchEle < arr[mid])
            {
                high = mid;
                mid = (low+ high)/2;
            }

            else
            {
                low = mid + 1 ;
                mid = (low+ high)/2;
            }

        }

        if(eleFound)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");



    }
}
