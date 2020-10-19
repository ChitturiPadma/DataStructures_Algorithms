package com.expedia.demos.ds.searching;

public class SearchElementInfiniteSizeArray {

    public static void main(String[] args)
    {
        int[] arr = {1, 10, 15, 20, 40, 60,80, 90, 100,  200, 500, 570, 680, 690, 725, 800, 850, 890, 912, 946, 972, 1000};

        int i = 1;
        int low ;
        int high ;

        int searchEle = 100;
        int index = -1;

        boolean elementFound = false;

        if(arr[0] == searchEle)
        {
            System.out.println("Element Found ");
        }
        else
        {
            while(arr[i] < searchEle)
                 i = i*2;

            if(arr[i] == searchEle)
                System.out.println("Element Found at index: " + i);

            else
            {
                System.out.println("In Else block");
                low = (i/2) + 1;
                high = i-1;
                System.out.println("Low: " + low);
                System.out.println("High: " + high);

                while(low < high)
                {
                   //System.out.println("In While loop");
                    int mid = (low + high)/2;
                    if(arr[mid] == searchEle)
                    {
                        elementFound = true;
                        index = mid;
                        break;

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
                    System.out.println("Element not found");
            }
        }

    }
}
