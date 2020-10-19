package com.expedia.demos.ds;

public class MajorityElement {

    public static void main(String[] args)
    {
        int[] arr =  {8, 3, 4,8, 5, 8, 8 }; //{8, 3, 8, 4, 8,  5, 8};
        int n = arr.length;
        int halfSize = n/2;

        int res = 0;
        int count = 1;

        // Get the index of element appearing maximum number of times
        for(int i =1; i<n;i++)
        {
            if(arr[res] == arr[i])
                count += 1;

            else count -=1;

            if(count == 0) // reset the index of the element when count becomes 0
            {
                res = i;
                count = 1;
            }

        }

        // Checking if the majority element chosen appears > n/2 times

        count = 0 ;

        int candidate = arr[res];

        for(int i=0;i<n;i++)
        {
            if(candidate == arr[i])
                count ++;

        }
        if(count <= halfSize)
            System.out.println("Candidate: " + candidate + " appears <= n/2 times");

        else
            System.out.println("Candidate: " + candidate + " appears > n/2 times");



        System.out.println("Index of element appearing majority times: " + res);

    }
}
